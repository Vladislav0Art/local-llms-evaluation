import sys
from random import shuffle
import json



BENCHMARKS_FILEPATH = "/home/ubuntu/projects/tga-pipeline/gitbug-projects/benchmarks.json"
OUTPUT_FILEPATH = f"{sys.argv[1]}/benchmarks-short.json"
SELECTION = int(sys.argv[2]) if (len(sys.argv) > 2) else 5


with open(BENCHMARKS_FILEPATH, 'r') as input:
    data = json.load(input)
    shuffle(data)

    selection = data[:SELECTION]

    with open(OUTPUT_FILEPATH, 'w') as output:
        json.dump(selection, output, indent=4)

print(f"{SELECTION} selected benchmarks from '{BENCHMARKS_FILEPATH}' are written into: '{OUTPUT_FILEPATH}'")