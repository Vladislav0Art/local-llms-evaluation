import os
from typing import Dict, List
import pandas as pd
import pingouin as pg
import numpy as np
import matplotlib.pyplot as plt




def count_iterations_with_compilable_test_cases(data):
    """
    Count the number of iterations with at least one compilable test case per project
    """
    iteration_counts = data[data['compilable_test_cases'] > 0].groupby('build_id')['iteration'].count().reset_index(name='iteration_count')
    print(f"Iterations Count Shape: {iteration_counts.shape}")
    return iteration_counts


def threshold_projects_on_compilable_iterations(data, n: int):
    """
    Filter out projects with less than N iterations with at least 1 compilable test case
    """
    iteration_counts = count_iterations_with_compilable_test_cases(data)
    iteration_counts = iteration_counts[iteration_counts['iteration_count'] >= n]

    data = data[data['build_id'].isin(iteration_counts['build_id'])]
    data = data[data['compilable_test_cases'] > 0]

    return data




def A12(lst1,lst2,rev=True):
    """
    The Vargha and Delaney's A12 statistics.
    "how often is x in lst1 more than y in lst2?"

    Source: https://gist.github.com/timm/5630491
    """
    more = same = 0.0
    for x in lst1:
        for y in lst2:
            if   x==y : same += 1
            elif rev     and x > y : more += 1
            elif not rev and x < y : more += 1
    return (more + 0.5*same)  / (len(lst1)*len(lst2))



def filter_out_failed_iterations(data, filepath):
    header = "Project,Iteration,Used Feedback Cycle Attempts,Total Feedback Cycle Attempts"

    if os.path.exists(filepath):
        with open (filepath, 'r') as file:
            lines = file.readlines()
            # remove \n at the end of lines
            lines = list(map(lambda l: l.removesuffix("\n"), lines))

            start_index = lines.index(header)
            assert(start_index != -1)

            lines = lines[(start_index+1):]

            for line in lines:
                project_id, iteration, _, _  = line.split(",")
                iteration = int(iteration)

                # print(f"Filter out: project_id={project_id}, iteration={iteration}")

                mask = (data['build_id'] != project_id) | ((data['build_id'] == project_id) & (data['iteration'] != iteration))
                data = data[mask]
    return data


def filter_out_projects_within_list(data, project_ids):
    mask = None
    for project_id in project_ids:
        if mask is None:
            mask = (data['build_id'] != project_id)
        else:
            mask = mask & (data['build_id'] != project_id)

    if mask is not None:
        return data[mask]
    else:
        return data


def calculate_pvalue_and_A12(coverage, result, prompt_id_A, prompt_id_B, metric_name):
    project_p_values: Dict[str, Dict] = {}

    for build_id, data in coverage.groupby('build_id'):
        line_coverage_A = pd.Series(data[f'{metric_name}_{prompt_id_A}'].to_numpy())
        line_coverage_B = pd.Series(data[f'{metric_name}_{prompt_id_B}'].to_numpy())

        t_test_line_coverage_result = pg.ttest(line_coverage_A, line_coverage_B)
        # print(f"build_id='{build_id}':\n{t_test_line_coverage_result}")
        project_p_values[build_id] = dict({
            "pvalue": t_test_line_coverage_result['p-val'][0],
            "group_A": line_coverage_A,
            "group_B": line_coverage_B,
        })

    line_coverage_a12 = []
    line_coverage_pvalue = []

    for build_id, data in project_p_values.items():
        pvalue, group_A, group_B = data["pvalue"], data["group_A"], data["group_B"]

        a12 = A12(group_A, group_B)
        print(f"{build_id}: pvalue={pvalue}, A12={a12}")
        line_coverage_pvalue.append(pvalue)
        line_coverage_a12.append(a12)

    result['pvalue'] = line_coverage_pvalue.copy()
    result['A12'] = line_coverage_a12.copy()



def prettify_prompt_name(prompt_id):
    if prompt_id == 'augmented_full_prompt':
        return "Fully Augmented"
    if prompt_id == 'basic_prompt':
        return 'Basic'
    if prompt_id == 'methods_only_prompt':
        return 'Methods-Only'
    if prompt_id == 'polymorphism_only_prompt':
        return 'Polymorphism-Only'

    print(f"Unsupported prompt id: '{prompt_id}'")
    return prompt_id



##################################################
# The following are methods for the box plotting #
##################################################


def is_iterable(obj):
    try:
        iter(obj)
        return True
    except TypeError:
        return False


def annotate_values(ax, data, median_xy, mean_xy):
    median_val = np.median(data)
    mean_val = np.mean(data)
    # print(f"got: median_xy={median_xy} (local median={median_val}), mean_xy={mean_xy} (local mean={mean_val})")

    # Annotate mean and median values on the y-axis
    ax.annotate(f'{median_val:.2f}', xy=median_xy, xytext=(median_xy[0], median_xy[1]-1.5),#(1, median_val), # xy=(1, median_val)
                    fontsize=8, color='r', horizontalalignment='right')

    ax.annotate(f'{mean_val:.2f}', xy=mean_xy, xytext=(mean_xy[0], mean_xy[1]-1.5),#(1, mean_val), #xy=(1, mean_val)
                    fontsize=8, color='b', horizontalalignment='left')
    # arrowprops=dict(facecolor='red', arrowstyle='->')


def get_start_coordinates(boxplot, name, index) -> tuple:
    x = boxplot[name][index].get_xdata()[0]
    y = boxplot[name][index].get_ydata()[0]
    return (x, y)


def draw_boxplot(data, labels: list[str], ax, boxplotcolors: List[str]):
    bp = ax.boxplot(data, labels=labels, meanline=True, showmeans=True, patch_artist=True)

    # color the mean line
    for mean in bp['means']:
        mean.set_color('b')


    # color the boxes
    for i in range(len(bp['boxes'])):
        patch = bp['boxes'][i]
        color = boxplotcolors[i]
        patch.set_facecolor(color)


    if len(data) > 0 and is_iterable(data[0]):
        for i in range(len(data)):
            arr = data[i]

            median_x, median_y = get_start_coordinates(bp, 'medians', i)
            mean_x, mean_y = get_start_coordinates(bp, 'means', i)
            # print("median", median_x, median_y)
            # print("mean", mean_x, mean_y)

            annotate_values(ax, arr, median_xy=(median_x-0.02, median_y), mean_xy=(mean_x+0.17, mean_y))
    else:
        median_x, median_y = get_start_coordinates(bp, 'medians', 0)
        mean_x, mean_y = get_start_coordinates(bp, 'means', 0)
        annotate_values(ax, data, median_xy=(median_x-0.02, median_y), mean_xy=(mean_x+0.17, mean_y))

    return bp


# TODO: re-implement this method
def select_color(prompt_id):
    if prompt_id == 'augmented_full_prompt':
        return 'lightblue'
    if prompt_id == 'basic_prompt':
        return 'lightgray'
    if prompt_id == 'methods_only_prompt':
        return 'lightpink'
    if prompt_id == 'polymorphism_only_prompt':
        return 'thistle'

    print(f"Unsupported prompt id: '{prompt_id}'")
    return 'lightblue'




def build_comparison_boxplot(
        dataset_A,
        dataset_B,
        prompt_type_A: str,
        prompt_type_B: str,
        ylabel: str,
        title: str = None,
):
    fig, ax = plt.subplots(figsize=(3.5, 5), sharey=False)

    color_A = select_color(prompt_type_A)
    color_B = select_color(prompt_type_B)

    bp = draw_boxplot(
        data=[dataset_A, dataset_B],
        labels=[prettify_prompt_name(prompt_type_A), prettify_prompt_name(prompt_type_B)],
        ax=ax,
        boxplotcolors=[color_A, color_B],
    )

    # Setting Y-axis label
    ax.set_ylabel(ylabel)

    plt.legend([bp['means'][0], bp['medians'][0]], ['Mean', 'Median'], loc=(1.03, 0.88)) # loc='upper right'

    if title is not None:
        fig.suptitle(title, horizontalalignment='center')

    plt.show()
    return bp