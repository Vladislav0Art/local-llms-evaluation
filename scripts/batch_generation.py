import sys
import argparse


def main():
    pass


if __name__ == "__main__":
    # if len(sys.argv) != 2:
    #     print("Usage: python script.py <path_to_benchmarks_json> <batch_size> <generation_iterations> --start-with <project_id>")
    #     sys.exit(1)

    # test_generation_output_dirpath = sys.argv[1]
    parser = argparse.ArgumentParser(description="Process command line arguments.")
    parser.add_argument("benchmarks_filepath", type=str, help="Path to JSON file with all the benchmarks")
    parser.add_argument("batch_size", type=int, help="Batch size of the benchmarks for which the generation will be executed")
    parser.add_argument("generation_iterations", type=int, help="Generation iterations for a batch of benchmarks")
    parser.add_argument("--start-with", type=str, help="Project ID to start with (in the case of failed execution)")

    args = parser.parse_args()

    main()
