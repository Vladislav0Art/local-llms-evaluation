import argparse
import os
from typing import List, Dict
from dataclasses import dataclass
import re


def get_generation_iterations_count(dirpath):
    directories = next(os.walk(dirpath))[1]
    return len(directories)

execution_abortion_str: str = "Prompt size reduction is not possible, aborting..."
feedback_cycle_attempt_prefix: str = "============================== Feedback Cycle Iteration "
feedback_cycle_attempt_pattern = r'.*(\d+)/(\d+).*'


@dataclass
class AbortionInfo:
    iteration: int
    feedback_cycle_attempts_used: int
    feedback_cycle_attempts_total: int


def main(dirpath: str, output_filepath: str):
    iterations_count = get_generation_iterations_count(dirpath)

    abortions: Dict[str, List[AbortionInfo]] = dict()

    for iteration in range(iterations_count):
        project_ids = next(os.walk(os.path.join(dirpath, str(iteration))))[1]

        for project_id in project_ids:
            test_generation_filepath = os.path.join(dirpath, str(iteration), project_id, "generated-artifacts", "test-generation.log")

            with open(test_generation_filepath, 'r') as file:
                lines = file.readlines()
                aborted = False
                feedback_cycle_attempts_used: int = 0
                feedback_cycle_attempts_total: int = 0

                for line in lines:
                    if execution_abortion_str in line:
                        aborted = True
                    if line.startswith(feedback_cycle_attempt_prefix):
                        matches = re.findall(feedback_cycle_attempt_pattern, line)
                        assert(matches)
                        a, b = matches[0]
                        feedback_cycle_attempts_used = int(a)
                        feedback_cycle_attempts_total = int(b)

                if aborted is True:
                    if project_id not in abortions:
                        abortions[project_id] = []

                    abortions[project_id].append(
                        AbortionInfo(
                            iteration=iteration,
                            feedback_cycle_attempts_used=feedback_cycle_attempts_used,
                            feedback_cycle_attempts_total=feedback_cycle_attempts_total,
                        )
                    )

    with open(output_filepath, 'w') as output:
        output.write(f"dirpath='{dirpath}'\n")
        output.write("==== Abortion Info ====\n")

        output.write('Abortion due to "LLM context size exceeded the token limit" occured for projects:\n')
        for project_id in abortions.keys():
            output.write(f"\t{project_id},{len(abortions[project_id])}\n")

        output.write("\n\n")

        output.write("Project,Iteration,Used Feedback Cycle Attempts,Total Feedback Cycle Attempts\n")
        for project_id in abortions.keys():
            for info in abortions[project_id]:
                output.write(f"{project_id},{info.iteration},{info.feedback_cycle_attempts_used},{info.feedback_cycle_attempts_total}\n")



if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Process command line arguments.")
    parser.add_argument("-d", "--dirpath", type=str, required=True, help="Dirpath to TestSpark generation folder")
    parser.add_argument("-f", "--filepath", type=str, required=True, help="Filepath where to save the data")

    args = parser.parse_args()

    main(args.dirpath, args.filepath)
