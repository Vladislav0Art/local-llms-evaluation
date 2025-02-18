import csv
import argparse
from typing import Union, List


def main(filepath: str, round_to: int, percentage: bool, output_filepath: Union[str, None]):
    lines: List[str] = []

    with open(filepath, 'r') as file:
        reader = csv.reader(file)

        header = next(reader)
        lines.append(header)

        for row in reader:
            converted_row = []
            index = 0
            for element in row:
                try:
                    # skip index column
                    if ((header[index] == '') or (header[index] == 'index')):
                        converted_row.append(element)
                        continue

                    value: float = float(element)
                    # if not pvalue and A12 columns convert to percentage if requested
                    if ((header[index] != 'pvalue') and (header[index] != 'A12')) and \
                        (percentage is True) and (0 <= value <= 1.0):
                        value = 100 * value

                    if (header[index] == 'pvalue'):
                        value = round(value, 4)
                    # round up to the desired number of decimal digits
                    else:
                        value = round(value, round_to)

                    converted_row.append(value)
                except ValueError:
                    converted_row.append(element)
                finally:
                    index += 1

            converted_row = map(lambda x: str(x), converted_row)
            lines.append(converted_row)

    if output_filepath is not None:
        with open(output_filepath, 'w') as output:
            writer = csv.writer(output)
            writer.writerows(lines)
    else:
        for line in lines:
            print(','.join(line))




if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Process command line arguments.")
    parser.add_argument("-f", "--filepath", type=str, required=True, help="Filepath to CSV data with statistical results")
    parser.add_argument("-r", "--round", type=int, default=2, help="Number of decimal digits to round the numerial data in CSV file")
    parser.add_argument("-p", "--percentage", action='store_true', help="Whether to covert the values in range [0, 1.0] into percentages")
    parser.add_argument("-o", "--output", type=str, required=False, help="Filepath where to store the processed CSV file")

    args = parser.parse_args()

    main(args.filepath, args.round, args.percentage, args.output)
