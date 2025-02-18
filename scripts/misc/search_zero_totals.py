
import json
import csv
import os
import logging
import argparse
from typing import Dict, List



def main(filepath: str):
    with open(filepath, 'r') as file:
        csvreader = csv.reader(file)
        header = next(csvreader)

        print("Header:", ','.join(header))
        lines_total_index = header.index('lines_total')
        branches_total_index = header.index('branches_total')

        for row in csvreader:
            # print(row)
            # print(row[lines_total_index])
            # print(row[branches_total_index])
            if int(row[lines_total_index]) == 0 or int(row[branches_total_index]) == 0:
                print(','.join(row))



if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Process command line arguments.")
    parser.add_argument("-f", "--filepath", type=str, required=True, help="filepath to a csv-file with projects data")

    args = parser.parse_args()

    main(args.filepath)
