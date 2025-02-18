import json
import os
import subprocess
import logging
import xml.etree.ElementTree as ET
import argparse
from dataclasses import dataclass
from typing import List, Dict, Any




# Configure logging
logging.basicConfig(level=logging.DEBUG, format='%(asctime)s - %(levelname)s - %(message)s')
logger = logging.getLogger()

# Add a file handler
file_handler = logging.FileHandler(filename='collect_testspark_coverage.log')
file_handler.setLevel(logging.DEBUG)
formatter = logging.Formatter('%(asctime)s - %(levelname)s - %(message)s')
file_handler.setFormatter(formatter)
logger.addHandler(file_handler)



@dataclass
class Benchmark:
    project_root: str
    build_id: str
    klass: str
    klass_dir: str
    klass_path: str
    klass_name: str


@dataclass
class CoverageMetric:
    name: str
    total: int
    covered: int


@dataclass
class CoverageResult:
    instructions: CoverageMetric
    lines: CoverageMetric
    branches: CoverageMetric

    def __str__(self) -> str:
        return f"CoverageResult[instructions={self.instructions.covered}/{self.instructions.total}, lines={self.lines.covered}/{self.lines.total}, branches={self.branches.covered}/{self.branches.total}]"


ZERO_COVERAGE: CoverageResult = CoverageResult(
    instructions=CoverageMetric("instructions", 0, 0),
    lines=CoverageMetric("lines", 0, 0),
    branches=CoverageMetric("branches", 0, 0),
)



@dataclass
class BenchmarkCoverage:
    build_id: str
    klass: str
    coverage: CoverageResult


def get_generation_iterations_count(dirpath):
    # Get list of directories within the dirpath
    logger.debug(f"Walking in '{dirpath}'")
    directories = next(os.walk(dirpath))[1]
    logger.debug(f"Found directories: {directories}")
    return len(directories)



def get_all_benchmarks(project_output_dir_root: str) -> List[Benchmark]:
    benchmark_list: List[Benchmark] = []

    logger.debug(f"Project output directory root: '{project_output_dir_root}'")
    print(f"dirs={os.listdir(project_output_dir_root)}")

    for dirname in os.listdir(project_output_dir_root):
        project_dirpath = os.path.join(project_output_dir_root, dirname)
        if not os.path.isdir(project_dirpath):
            continue

        benchmark_filepath = os.path.join(project_dirpath, "benchmark.json")

        with open(benchmark_filepath, 'r') as benchmark_file:
            benchmark = json.load(benchmark_file)

            project_root: str = benchmark["root"]
            build_id: str = benchmark["buildId"]
            klass: str = benchmark["klass"]

            klass_dir: str = os.path.join(*klass.split(".")[:-1])
            klass_path: str = os.path.join(*klass.split("."))
            klass_name: str = klass.split(".")[-1]

            benchmark_list.append(Benchmark(
                project_root,
                build_id,
                klass,
                klass_dir,
                klass_path,
                klass_name,
            ))

    return benchmark_list



def collect_jacoco_exec_file_for_compilable_tests(
    # path to the directory containing all the generated artifact, e.g. '/home/TestSpark/0/epubcheck-49aacb238c'
    project_root_dir: str,
    # path to the directory containing the generated test cases and test suite
    project_generation_dir: str,
) -> List[str]:
    @dataclass
    class Klass:
        java_filepath: str
        class_filepath: str
        filename_no_ext: str

    def construct_klass(test) -> Klass:
        filename_no_ext = test.split(".")[-1]
        java_filepath = os.path.join(project_generation_dir, f"{filename_no_ext}.java")
        class_filepath = os.path.join(project_generation_dir, f"{filename_no_ext}.class")
        return Klass(java_filepath, class_filepath, filename_no_ext)

    logger.debug(f"Collect Jacoco exec-files for '{project_generation_dir}'...")

    jacoco_exec_files: List[str] = []
    test_suite_filepath = os.path.join(project_root_dir, "testSuite.json")

    with open(test_suite_filepath, 'r') as file:
        test_suite = json.load(file)
        klasses = [construct_klass(test) for test in test_suite['tests']]

        for klass in klasses:
            logger.debug(f"\tConsidering class '{klass.filename_no_ext}'")
            # Java class was compiled successfully
            if os.path.exists(klass.java_filepath) and os.path.exists(klass.class_filepath):
                logger.debug(f"\t\t'{klass.filename_no_ext}': both java- and class-files found")
                # searching for corresponding Jacoco exec-file
                jacoco_filename = f"jacoco-{klass.filename_no_ext}.exec"
                jacoco_filepath = os.path.join(project_generation_dir, jacoco_filename)
                # jacoco coverage was generated successfully
                if os.path.exists(jacoco_filepath):
                    logger.debug(f"\t\t'{klass.filename_no_ext}': Jacoco exec-file '{jacoco_filename}' found")
                    jacoco_exec_files.append(jacoco_filepath)
                else:
                    logger.debug(f"\t\t'{klass.filename_no_ext}': Jacoco exec-file '{jacoco_filename}' missing")

            if not os.path.exists(klass.java_filepath):
                logger.debug(f"\t\t'{klass.filename_no_ext}': java-file missing")
            if not os.path.exists(klass.class_filepath):
                logger.debug(f"\t\t'{klass.filename_no_ext}': class-file missing")

    return jacoco_exec_files



def find_source_file_in_benchmark(benchmark_root: str, relative_target_filepath: str) -> str:
    for root, _, files in os.walk(benchmark_root):
        for file in files:
            filepath = os.path.join(root, file)
            if filepath.endswith(relative_target_filepath):
                return filepath
    raise ValueError(f"Filepath with the suffix '{relative_target_filepath}' not found in project under '{benchmark_root}'")



def generated_jacoco_xml_coverage_report(
    project_generation_dir: str,
    output_xml_filename_no_ext: str,
    jacococli_jar_filepath: str,
    # filepath to the java executable
    java_exec_filepath: str,
    # filepath to the java-file of class under test
    java_filepath: str,
    # filepath to the compiled class-file of class under test
    class_filepath: str,
    # list of jacoco exec-files
    jacoco_exec_files: List[str],
) -> str:
    command = [
        java_exec_filepath, "-jar", jacococli_jar_filepath, "report", *jacoco_exec_files,
        "--classfiles", class_filepath,
        "--sourcefiles", java_filepath,
        "--xml", f"./{output_xml_filename_no_ext}.xml"
    ]
    logger.debug(f"\tExecute Jacoco CLI command: {command}")

    process = subprocess.Popen(command, cwd=project_generation_dir)
    stdout_data, stderr_data = process.communicate()

    logger.debug(f"\tJacoco CLI stdout: '{stdout_data}'")
    logger.debug(f"\tJacoco CLI stderr: '{stderr_data}'")

    xml_report_filepath = os.path.join(project_generation_dir, f"{output_xml_filename_no_ext}.xml")
    if not os.path.exists(xml_report_filepath):
        raise RuntimeError(f"Jacoco XML coverage report was not found at '{xml_report_filepath}'")

    return xml_report_filepath



def xml2json(xml_element) -> Dict[str, Any]:
    # Convert the element's attributes to a dictionary
    attributes = xml_element.attrib
    # Create an empty dictionary to store the element's data
    data = {}
    # Add the element's attributes to the dictionary
    data.update(attributes)
    # Add the element's text content to the dictionary if it exists
    if xml_element.text:
        data[xml_element.tag] = xml_element.text
    # Recursively convert the element's children to dictionaries and add them to the dictionary
    for child in xml_element:
        child_data = xml2json(child)
        if child.tag in data:
            # If the tag already exists in data, convert it to a list
            if isinstance(data[child.tag], list):
                data[child.tag].append(child_data)
            else:
                data[child.tag] = [data[child.tag], child_data]
        else:
            data[child.tag] = child_data
    return data



def collect_coverage_in_xml_report(xml_report_filepath) -> CoverageResult:
    tree = ET.parse(xml_report_filepath)
    root = tree.getroot()
    json_data = xml2json(root)

    instructions: CoverageMetric = CoverageMetric(name="instructions", covered=0, total=0)
    lines: CoverageMetric = CoverageMetric(name="lines", covered=0, total=0)
    branches: CoverageMetric = CoverageMetric(name="branches", covered=0, total=0)

    for coverage_result in json_data['counter']:
        missed = int(coverage_result['missed'])
        covered = int(coverage_result['covered'])
        total = covered + missed

        if coverage_result['type'] == "INSTRUCTION":
            instructions = CoverageMetric(name="instructions", covered=covered, total=total)
        elif coverage_result['type'] == "LINE":
            lines = CoverageMetric(name="lines", covered=covered, total=total)
        elif coverage_result['type'] == "BRANCH":
            branches = CoverageMetric(name="branches", covered=covered, total=total)

    coverage = CoverageResult(
        instructions=instructions,
        lines=lines,
        branches=branches,
    )

    logger.debug(f"\tCollected coverage: {coverage}")

    return coverage





def main(test_generation_output_dirpath: str, jacococli_jar_filepath: str):
    """
    Main function to collect and save the coverage results of benchmarks generated by TestSpark.
    This function iterates over the test generation output directories, collects coverage data for each benchmark,
    and saves the results into a JSON file. It uses Jacoco to generate coverage reports and parses the results
    to extract coverage information.
    Args:
        `test_generation_output_dirpath` (str): The directory path where the test generation outputs are stored
                                                (it SHOULD include `TestSpark` suffix also).
        `jacococli_jar_filepath` (str): The file path to the Jacoco CLI JAR file.
    Returns:
        None
    """

    iterations_count = get_generation_iterations_count(test_generation_output_dirpath)
    logger.debug(f"Iterations count: {iterations_count}")

    for iteration in range(iterations_count):
        logger.debug(f"Current iteration: {iteration}")
        benchmarks_iteration_coverage: List[BenchmarkCoverage] = []

        prefix_path = os.path.join(test_generation_output_dirpath, f"run-{str(iteration)}")
        benchmarks: List[Benchmark] = get_all_benchmarks(prefix_path)

        iteration_coverage_output_filepath = os.path.join(prefix_path, "testspark-coverage-results.json")

        with open(iteration_coverage_output_filepath, 'w') as iteration_coverage_output_file:
            for benchmark in benchmarks:
                logger.debug(f"===================== Benchmark '{benchmark.build_id}', klass '{benchmark.klass}' =====================")

                # search for Java and class source files of the class under test
                java_filepath = find_source_file_in_benchmark(benchmark.project_root, f"{benchmark.klass_path}.java")
                class_filepath = find_source_file_in_benchmark(benchmark.project_root, f"{benchmark.klass_path}.class")

                logger.debug(f"\tSource java filepath: '{java_filepath}'")
                logger.debug(f"\tSource class filepath: '{class_filepath}'")

                project_root_dir = os.path.join(prefix_path, benchmark.build_id)
                project_generation_dir = os.path.join(project_root_dir, benchmark.klass_dir)

                # collect all the exec-files produced by Jacoco of test cases stored in the testSuite.json file
                jacoco_exec_files = collect_jacoco_exec_file_for_compilable_tests(
                    project_root_dir,
                    project_generation_dir,
                )

                jacoco_exec_files_str = ',\n\t\t'.join(jacoco_exec_files)
                logger.debug(f"\tFound {len(jacoco_exec_files)} Jacoco exec-files: [\n\t\t{jacoco_exec_files_str}\n\t]")

                # if there no test generation output (e.g., because the prompt was too long)
                if not os.path.exists(project_generation_dir):
                    logger.debug(f"[WARNING]:\tproject '{benchmark.build_id}' has no generation output directory at '{project_generation_dir}'")
                    logger.debug("\tSaving default zero coverage")

                    benchmarks_iteration_coverage.append(BenchmarkCoverage(
                        build_id=benchmark.build_id,
                        klass=benchmark.klass,
                        coverage=ZERO_COVERAGE,
                    ))
                else:
                    # use java executable accessible from PATH
                    java_exec_filepath = "java"

                    # execute jacococli to produce xml-report for the selected exec-files
                    xml_report_filepath = generated_jacoco_xml_coverage_report(
                        project_generation_dir,
                        "coverage-report",
                        jacococli_jar_filepath,
                        java_exec_filepath,
                        java_filepath,
                        class_filepath,
                        jacoco_exec_files,
                    )
                    logger.debug(f"\tJacoco XML coverage report was generated into '{xml_report_filepath}'")

                    # collect coverage result from xml report
                    coverage: CoverageResult = collect_coverage_in_xml_report(xml_report_filepath)

                    benchmarks_iteration_coverage.append(BenchmarkCoverage(
                        build_id=benchmark.build_id,
                        klass=benchmark.klass,
                        coverage=coverage,
                    ))

            # save the iteration coverage of all projects into resulting json file
            json_data = []
            for benchmark_coverage in benchmarks_iteration_coverage:
                # mimic the structure of 'results.json' file to be compatible with 'build_csv.py' script
                json_data.append({
                    "benchmark": {
                        "klass": benchmark_coverage.klass,
                        "buildId": benchmark_coverage.build_id
                    },
                    "coverage": {
                        "klassId": {
                            "name": benchmark_coverage.klass,
                        },
                        "instructions": {
                            "covered": benchmark_coverage.coverage.instructions.covered,
                            "total": benchmark_coverage.coverage.instructions.total,
                        },
                        "lines": {
                            "covered": benchmark_coverage.coverage.lines.covered,
                            "total": benchmark_coverage.coverage.lines.total,
                        },
                        "branches": {
                            "covered": benchmark_coverage.coverage.branches.covered,
                            "total": benchmark_coverage.coverage.branches.total,
                        },
                    },
                })
            json.dump(json_data, iteration_coverage_output_file)


# python3 ./collect_testspark_coverage.py -d /home/ubuntu/research-work-2024/evaluation/final/configurations/RQ2/GPT-4/TestSpark  -j /home/ubuntu/research-work-2024/jacococli.jar

# python ./research/scripts/collect_testspark_coverage.py -d /home/ubuntu/projects/test-generation-sandbox/TestSpark -j /home/ubuntu/projects/tga-pipeline/lib/jacococli.jar
if __name__ == '__main__':
    parser = argparse.ArgumentParser(
        description="Process command line arguments.",
        usage="python [script] -d [path/to/generation/including/'TestSpark'] -j [path/to/jacococli.jar]")

    parser.add_argument("-d", "--test-generation-output-dirpath", type=str, required=True, help="Path to the directory with the test generation iterations (it should include 'TestSpark' directory as well)")
    parser.add_argument("-j", "--jacococli-jar", type=str, required=True, help="Filepath to the jacococli.jar file")

    args = parser.parse_args()

    # "/home/ubuntu/projects/tga-pipeline/lib/jacococli.jar"
    logger.debug(f"Test generation output dirpath: '{args.test_generation_output_dirpath}'")
    logger.debug(f"Jacoco CLI filepath: '{args.jacococli_jar}'")

    main(args.test_generation_output_dirpath, args.jacococli_jar)
