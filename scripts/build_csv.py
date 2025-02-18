import json
import csv
import os
import logging
import argparse
from typing import Dict, List, Union
from scripts.data import CoverageResult, CompilabilityResult, ProjectData



# Configure logging
logging.basicConfig(level=logging.DEBUG, format='%(asctime)s - %(levelname)s - %(message)s')
logger = logging.getLogger()

# Add a file handler
file_handler = logging.FileHandler(filename='main.log')
file_handler.setLevel(logging.DEBUG)
formatter = logging.Formatter('%(asctime)s - %(levelname)s - %(message)s')
file_handler.setFormatter(formatter)
logger.addHandler(file_handler)


def get_generation_iterations_count(dirpath):
    # Get list of directories within the dirpath
    logger.debug(f"Walking in '{dirpath}'")
    directories = next(os.walk(dirpath))[1]
    logger.debug(f"Found directories: {directories}")
    return len(directories)



def store_generated_data_in_csv_file(
    projects_data: Dict[str, ProjectData],
    prompt_id: str,
    csv_output_filepath: str,
):
    logger.debug(f"Storing generated data into CSV file at '{csv_output_filepath}'")

    parent_dirpath = os.path.dirname(csv_output_filepath)
    if not os.path.exists(parent_dirpath):
        logger.debug(f"CSV file not found. Creating its parent directories...")
        os.makedirs(parent_dirpath)

    logger.debug("Opening CSV file for data appending...")
    with open(csv_output_filepath, 'a', newline='') as file:
        writer = csv.writer(file)

        if os.path.getsize(csv_output_filepath) == 0:
            logger.debug("CSV file is empty. Writing CSV data header")
            writer.writerow([
                "build_id", "cut_quialified_name", "iteration", "prompt_id", "lines_covered", "lines_total", "branches_covered", "branches_total", "compilable_test_cases", "total_test_cases",
            ])
        else:
            logger.debug("CSV file has content. Skipping CSV data header")

        logger.debug("Saving projects data into CSV file...")
        for build_id, project_data in projects_data.items():
            # avg_instructions_coverage = find_coverage_average(data.instructions)
            # avg_lines_coverage = find_coverage_average(data.lines)
            # avg_branches_coverage = find_coverage_average(data.branches)

            logger.debug(f"==================== Saving project '{build_id}' ====================")

            for iteration in range(project_data.iterations_count):
                if (iteration not in project_data.lines) or (iteration not in project_data.branches):
                    logger.debug(f"\tNo iteration {iteration} for project '{build_id}'")
                    continue

                lines_covered: int = project_data.lines[iteration].covered
                lines_total:   int = project_data.lines[iteration].total

                branches_covered: int = project_data.branches[iteration].covered
                branches_total:   int = project_data.branches[iteration].total

                compilable_test_cases_count: int = project_data.compilabilities[iteration].compilable_test_cases_count
                total_test_cases_count:      int = project_data.compilabilities[iteration].total_test_cases_count

                klass = project_data.klass

                logger.debug(f"\tIteration={iteration}: saving row: '{build_id},{klass},{iteration},{prompt_id},{lines_covered},{lines_total},{branches_covered},{branches_total},{compilable_test_cases_count},{total_test_cases_count}'")

                writer.writerow([
                    build_id, klass, iteration, prompt_id, lines_covered, lines_total, branches_covered, branches_total, compilable_test_cases_count, total_test_cases_count,
                ])

            logger.debug(f"==================== Project '{build_id}' saved for all {project_data.iterations_count} iterations ====================\n\n")




def collect_total_test_cases_count(generated_java_files: List[str], test_suite_filename: str) -> int:
    test_suite_lst: List[str] = list(filter(lambda file: file.endswith(test_suite_filename), generated_java_files))
    test_suite_filepath: Union[str, None] = test_suite_lst[0] if (len(test_suite_lst) > 0) else None

    # cnt(all test cases) = [all java files] - [test suite file (if any)]
    total_test_cases_count = len(generated_java_files)

    if test_suite_filepath is not None:
        total_test_cases_count -= 1

    return total_test_cases_count



def collect_compilable_test_cases_count(
    generated_java_files: List[str],
    generated_class_files: List[str],
    test_suite_filename: str,
) -> int:
    compilable_test_cases: List[str] = []

    for java_file in generated_java_files:
        # skipping test suite .java-file
        if test_suite_filename == os.path.basename(java_file):
            continue

        filename: str = os.path.basename(java_file).replace(".java", ".class")
        compilable: bool = (len(list(filter(lambda classfile: classfile.endswith(filename), generated_class_files))) > 0)

        if compilable: compilable_test_cases.append(java_file)

    compilable_test_cases_count: int = len(compilable_test_cases)

    compilable_test_cases_str = ',\n'.join(compilable_test_cases)
    logger.debug(f"\tTest suite '{test_suite_filename}' contains {compilable_test_cases_count} compilable test cases: [\n{compilable_test_cases_str}\n]")

    return compilable_test_cases_count



def find_compilability_result(
    test_generation_output_dirpath: str,
    iteration: int,
    build_id: str,
    klass: str,
    # test suite filename with extention (i.e. with '.java')
    test_suite_filename: str,
) -> CompilabilityResult:
    logger.debug(f"\tCollection compilation data for project '{build_id}'")

    packages: List[str] = klass.split('.')[:-1]
    logger.debug(f"\tPackages of CUT '{klass}': {packages}")

    # dirpath where the generated java-files are stored
    project_dirpath = os.path.abspath(
        os.path.join(test_generation_output_dirpath, f"run-{str(iteration)}", build_id, *packages))

    logger.debug(f"\tProject dirpath with generated classes: '{project_dirpath}'")

    # collecting the total and compilable numbers of generated test cases
    generated_java_files = [os.path.join(root, file)
                            for root, _, files in os.walk(project_dirpath)
                                for file in files if file.endswith(".java")
                            ]
    generated_java_files_str = ',\n'.join(generated_java_files)
    logger.debug(f"\tGenerated Java files: [\n{generated_java_files_str}\n]")

    generated_class_files = [os.path.join(root, file)
                             for root, _, files in os.walk(project_dirpath)
                                for file in files if file.endswith(".class")
                            ]
    generated_class_files_str = ',\n'.join(generated_class_files)
    logger.debug(f"\tCompiled class files: [\n{generated_class_files_str}\n]")

    total_test_cases_count: int = collect_total_test_cases_count(generated_java_files, test_suite_filename)
    compilable_test_cases_count: int = collect_compilable_test_cases_count(
        generated_java_files,
        generated_class_files,
        test_suite_filename,
    )

    result: CompilabilityResult = CompilabilityResult(compilable_test_cases_count, total_test_cases_count)
    logger.debug(f"\tCompilability result for project '{build_id}': {result}")

    return result



def main(test_generation_output_dirpath: str, prompt_id: str, output_filepath: str, data_json_filename: str):
    """
    Main function to process test generation results and store them in a CSV file.
    Args:
        test_generation_output_dirpath (str): The directory path where test generation outputs are stored.
        prompt_id (str): The identifier for the prompt used in test generation.
        output_filepath (str): The file path where the resulting CSV file will be saved.
        data_json_filename (str): The filename of the JSON file containing coverage data for each iteration.
    This function collects coverage and compilability data of every generation run for projects and
    stores it in a single CSV file.
    """

    iterations_count: int = get_generation_iterations_count(test_generation_output_dirpath)
    logger.debug(f"Iterations count: {iterations_count}")

    projects_data: Dict[str, ProjectData] = dict()

    for iteration in range(iterations_count):
        logger.debug(f"Current iteration: {iteration}")

        prefix_path = os.path.join(test_generation_output_dirpath, f"run-{str(iteration)}")
        results_filepath = os.path.join(prefix_path, data_json_filename)

        logger.debug(f"Entering directory '{prefix_path}'")

        coverage_types = ["instructions", "lines", "branches"]

        with open(results_filepath, 'r') as file:
            results = json.load(file)
            logger.debug(f"JSON file '{results_filepath.__str__()}' loaded successfully")

            for project in results:
                build_id = project["benchmark"]["buildId"]
                klass = project["benchmark"]["klass"]
                coverage = project["coverage"]

                logger.debug(f"==================== Project '{build_id}': CUT='{klass}', iteration={iteration} ====================")

                if build_id not in projects_data:
                    projects_data[build_id] = ProjectData(
                        iterations_count=iterations_count,
                        klass=klass,
                        instructions=dict(),
                        lines=dict(),
                        branches=dict(),
                        compilabilities=dict(),
                    )

                compilability_result: CompilabilityResult = find_compilability_result(
                    test_generation_output_dirpath=test_generation_output_dirpath,
                    iteration=iteration,
                    build_id=build_id,
                    klass=klass,
                    test_suite_filename="GeneratedTest.java"
                )

                projects_data[build_id].compilabilities[iteration] = compilability_result

                for coverage_type in coverage_types:
                    covered: int = coverage[coverage_type]["covered"]
                    total:   int = coverage[coverage_type]["total"]

                    logger.debug(f"coverage_type='{coverage_type}', covered={covered}, total={total}")

                    match coverage_type:
                        case "instructions":
                            projects_data[build_id].instructions[iteration] = CoverageResult(covered=covered, total=total)
                        case "lines":
                            projects_data[build_id].lines[iteration] = CoverageResult(covered=covered, total=total)
                        case "branches":
                            projects_data[build_id].branches[iteration] = CoverageResult(covered=covered, total=total)

                logger.debug(f"==================== Project '{build_id}' on iteration {iteration} processed ====================\n\n")

    store_generated_data_in_csv_file(
        projects_data=projects_data,
        prompt_id=prompt_id,
        csv_output_filepath=output_filepath,
    )
    logger.debug(f"CSV data is written into '{output_filepath}'")


if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Process command line arguments.")
    parser.add_argument("-d", "--test-generation-output-dirpath", type=str, required=True, help="Path to the directory with the test generation iterations (it should include 'TestSpark' directory as well)")
    parser.add_argument("-p", "--prompt-id", type=str, required=True, help="Prompt name/ID using which the test suites were generated (appended into the CSV file to easily distinguish between many CSV files)")
    parser.add_argument("-f", "--data-json-filename", type=str, default='results.json', required=True, help="Filename of a JSON file that contains coverage data generated by `collect_testspark_coverage.py` script, default is 'results.json'")
    parser.add_argument("-o", "--output-filepath", type=str, required=True, help="Filepath where to store the output CSV file (if CSV file with given name exists the program will append data to the end of the file)")

    args = parser.parse_args()


    logger.debug(f""" ******** Script configuration: ********
        **** test_generation_output_dirpath='{args.test_generation_output_dirpath}' ****
        **** prompt_id='{args.prompt_id}' ****
        **** output_filepath='{args.output_filepath}' ****\n""")

    main(
        args.test_generation_output_dirpath,
        args.prompt_id,
        args.output_filepath,
        args.data_json_filename,
    )

