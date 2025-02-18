import json
import argparse

# list of benchmarks for which the basic prompt can be generated
# projects = [
#     "epubcheck-49aacb238c",
#     "jsoup-1e69577e35",
#     "jsoup-6ccd158754",
#     "jsoup-0121311b1b",
#     "grammaticus-cdf67a1ad5",
#     "jsoup-29be991198",
#     "jsoup-1119192565",
#     "jsoup-a90bae7928",
#     "jsoup-e52224fbfe",

#     "frigga-126b52a558",
#     "jsoup-195f484ba5",

#     "ConfigMe-7bf10c5134",
#     "ConfigMe-aa91a6b315",
#     "crowdin-api-client-java-f0f22b2b56",
#     "database-engine-8314bfdec0",
#     "database-engine-c5f961f273",
#     "dataframe-ec-12af99192d",
#     "epubcheck-0759a82ae4",
#     "EvalEx-7c39c5478a",
#     "formatter-maven-plugin-3e9843d2ab",
#     "graphql-java-annotations-183752ce8b",
#     "java-solutions-8d81307ea1",
#     "java-stellar-sdk-6e9badb007",
#     "java-stellar-sdk-15cc6d2c81",
#     "java-stellar-sdk-1461c2fc5b",
#     "jsoup-f0ae81b13e",
#     "nfe-67518e14db",
#     "rcv-688920f277",
#     "solarpositioning-4d35aecb48",
#     "solarpositioning-79c0044373",
#     "traccar-1a1126d2d3",
#     "traccar-1b89932936",
#     "traccar-1c91d35263",
#     "traccar-1d31ebe88f",
#     "traccar-3b6900a953",
#     "traccar-3dad196b88",
#     "traccar-4a5b8d79b5",
#     "traccar-4ece72558c",
#     "traccar-5a1a8d9192",
#     "traccar-5c26f25b3b",
#     "traccar-5da3b8fcb4",
#     "traccar-5f56a56d77",
#     "traccar-007b4007e0",
#     "traccar-7c2f9e56ba",
#     "traccar-7ce4fb9a62",
#     "traccar-8ae0436e5e",
#     "traccar-8b4d3ee0b9",
#     "traccar-8de9a36abe",
#     "traccar-9a1cbeb7b7",
#     "traccar-9aef1bfcff",
#     "traccar-45a0d3b867",
#     "traccar-230f629c3d",
#     "traccar-392f00082f",
#     "traccar-413d9a49c4",
#     "traccar-782fd787d1",
#     "traccar-3642b95208",
#     "traccar-03650fff80",
#     "traccar-3771dd156e",
#     "traccar-4722f9b6b6",
#     "traccar-6631d7c4b3",
#     "traccar-105873ab52",
#     "traccar-514582dd83",
#     "traccar-779486a304",
#     "traccar-52799453e0",
#     "traccar-3331593759",
#     "traccar-7325030436",
#     "traccar-a9c311855a",
#     "traccar-a722658e5a",
#     "traccar-adbe25e9da",
#     "traccar-b4934e05aa",
#     "traccar-b77131f4be",
#     "traccar-c024d09744",
#     "traccar-c68e92043c",
#     "traccar-cadcd2676a",
#     "traccar-d4db066c6e",
#     "traccar-d244b4bc49",
#     "traccar-dfc546a26f",
#     "traccar-ec2b7b64a8",
#     "traccar-ed3950fbdc",
#     "traccar-f1de2533c3",
#     "traccar-f4d10160d9",
#     "traccar-f8fb3f67bc",
#     "traccar-fdbd269b9b",
#     "word-wrap-e59eedf0ba",
# ]


# projects_llama8b = [
#     "ConfigMe-7449db4901",
#     "ConfigMe-cab40d1c3c",
#     "EvalEx-df8eeeb85e",
#     "crowdin-api-client-java-334d414753",
#     "database-engine-403a4c0b3b",
#     "dataframe-ec-1109752c4e",
#     "dataframe-ec-d11d1fdeaa",
#     "epubcheck-8575a6b1c4",
#     "epubcheck-873d4f5dbb",
#     "formatter-maven-plugin-a6994326aa",
#     "frigga-6b520bbb2e",
#     "graphql-java-annotations-6d9d7a79de",
#     "java-solutions-7a73ea56d0",
#     "java-stellar-sdk-06641953c4",
#     "jsoup-23573ef31c",
#     "jsoup-2f48a617fe",
#     "jsoup-5afef3ecc0",
#     "jsoup-6e1335e35c",
#     "jsoup-9170b1d17b",
#     "jsoup-9d104b7ea2",
#     "jsoup-a349582236",
#     "jsoup-a90bae7928",
#     "jsoup-b129bc9e3b",
#     "jsoup-c507588b5c",
#     "jsoup-e1880ad73e",
#     "jsoup-eff15210b0",
#     "jsoup-f0eb6bd1cc",
#     "solarpositioning-2756287e64",
#     "traccar-0ec73ae585",
#     "traccar-2ed386ecd1",
#     "traccar-4722f9b6b6",
#     "traccar-85501f9cf4",
#     "traccar-b77131f4be"
# ]


# projects_llama3b = [
#     "ConfigMe-cab40d1c3c",
#     "database-engine-403a4c0b3b",
#     "epubcheck-873d4f5dbb",
#     "formatter-maven-plugin-a6994326aa",
#     "grammaticus-d6d4d50ea1",
#     "graphql-java-annotations-6d9d7a79de",
#     "jsoup-5afef3ecc0",
#     "jsoup-9170b1d17b",
#     "jsoup-a90bae7928",
#     "jsoup-b129bc9e3b",
#     "jsoup-e1880ad73e",
#     "jsoup-eff15210b0",
#     "jsoup-f0eb6bd1cc",
#     "word-wrap-930eb5e91a",
# ]


projects = [
    "ConfigMe-7449db4901"
]


# projects_llama1b = [
#     "epubcheck-8575a6b1c4",
#     "java-solutions-7a73ea56d0",
#     "jsoup-2f48a617fe",
#     "jsoup-4864af45af",
#     "jsoup-9170b1d17b",
#     "jsoup-9d104b7ea2",
#     "jsoup-c507588b5c",
#     "jsoup-eff15210b0",
# ]


# projects = [
#     "database-engine-403a4c0b3b",
#     "frigga-6b520bbb2e",
#     "formatter-maven-plugin-a6994326aa",
#     "word-wrap-930eb5e91a",
#     "graphql-java-annotations-6d9d7a79de",
#     "crowdin-api-client-java-334d414753",
#     "solarpositioning-2756287e64",
#     "solarpositioning-8faa18c702",
#     "traccar-2ed386ecd1",
#     "traccar-85501f9cf4",
#     "traccar-0ec73ae585",
#     "traccar-b77131f4be",
#     "traccar-4722f9b6b6",
#     "epubcheck-873d4f5dbb",
#     "epubcheck-8575a6b1c4",
#     "ConfigMe-cab40d1c3c",
#     "ConfigMe-7449db4901",
#     "dataframe-ec-1109752c4e",
#     "dataframe-ec-d11d1fdeaa",
#     "nfe-ec5ddf7e73",
#     "jaxb-xew-plugin-f2320aaa24",
#     "EvalEx-df8eeeb85e",
#     "grammaticus-d6d4d50ea1",
#     "jsoup-c507588b5c",
#     "jsoup-6e1335e35c",
#     "jsoup-b129bc9e3b",
#     "jsoup-9d104b7ea2",
#     "jsoup-a349582236",
#     "jsoup-2f48a617fe",
#     "jsoup-a90bae7928",
#     "jsoup-5afef3ecc0",
#     "jsoup-23ea77ef4b",
#     "jsoup-e1880ad73e",
#     "jsoup-23573ef31c",
#     "jsoup-9170b1d17b",
#     "jsoup-4864af45af",
#     "jsoup-eff15210b0",
#     "jsoup-f0eb6bd1cc",
#     "java-solutions-7a73ea56d0",
#     "java-stellar-sdk-06641953c4",
# ]




def main(filepath: str, output_filepath: str, projects: list[str]):
    selected_benchmarks = []

    with open(filepath, 'r') as file:
        benchmarks = json.load(file)

        for build_id in projects:
            found = False
            for benchmark in benchmarks:
                if build_id == benchmark['build_id']:
                    found = True
                    selected_benchmarks.append(benchmark)
                    break
            if not found:
                print(f"[WARNING]\tProject with id '{build_id}' not found among the benchmarks at '{filepath}'")

        with open(output_filepath, 'w') as output:
            json.dump(selected_benchmarks, output)
            print(f"[NOTICE]\t{len(selected_benchmarks)}/{len(projects)} benchmarks are written into '{output_filepath}'")




if __name__ == '__main__':
    parser = argparse.ArgumentParser(description="Process command line arguments.")
    parser.add_argument("-f", "--filepath", type=str, required=True, help="Filepath to the JSON file with all the benchmarks")
    parser.add_argument("-o", "--output", type=str, required=False, help="Filepath where to store the selected benchmarks")

    args = parser.parse_args()

    main(args.filepath, args.output, projects=projects)
