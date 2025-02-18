import os
import json

def find_json_files(dirpath):
    json_files = []
    for root, _, files in os.walk(dirpath):
        for file in files:
            if file == 'iterations.json':
                json_files.append(os.path.join(root, file))
    return json_files



def calculate_average_tokens_count(json_files):
    total_tokens = 0
    count = 0

    for file in json_files:
        # print(file)
        with open(file, 'r') as f:
            try:
                data = json.load(f)

                if 'iterations' not in data:
                    continue

                iterations = data['iterations']
                # print(f"iterations: {iterations}")

                tokens_sum_project = 0
                count_project = 0

                for iteration in iterations:
                    if ('promptLength' in iteration) and ('responseLength' in iteration):
                            tokens_sum_project += (iteration['promptLength'] + iteration['responseLength'])
                            count_project += 1

                avg_tokens_project = (tokens_sum_project / count_project if count_project > 0 else 0)

                print(f"avg tokens in project: {avg_tokens_project}")
                total_tokens += avg_tokens_project
                count += 1 if count_project > 0 else 0

            except json.JSONDecodeError:
                continue

    print(f"total_tokens={total_tokens}, count={count}")
    return total_tokens / count if count > 0 else 0


def main(dirpath):
    json_files = find_json_files(dirpath)
    average_tokens_count = calculate_average_tokens_count(json_files)
    print(f"Average tokens size: {average_tokens_count}")

if __name__ == "__main__":
    dirpath = '/home/ubuntu/research-work-2024/evaluation/configurations/RQ1'
    main(dirpath)