import argparse
from typing import List, Dict, Tuple, Any, Union
from dataclasses import dataclass
from functools import total_ordering
import re
import os



@dataclass(eq=False)
class Klass:
    name: str
    package: str

    def __init__(self, fqn: str):
        components = fqn.split(".")

        self.name = components[-1]
        self.package = '.'.join(components[:-1])

    # fully qualified name: `package.name``
    def fqn(self) -> str:
        return f"{self.package}.{self.name}"



@dataclass(eq=False)
@total_ordering
class PolymorphicRelation:
    derived: Klass
    base: Klass

    def __lt__(self, other: 'PolymorphicRelation'):
        if self.base.fqn() == other.base.fqn():
            return self.derived.fqn() < other.derived.fqn()
        return self.base.fqn() < other.base.fqn()



@dataclass
class PolymorphicRelationUse:
    relation_used: PolymorphicRelation
    feedback_cycle_iteration: int
    line_index: int


@dataclass
class RelationUseCount:
    relation: PolymorphicRelation
    count: int




def get_generation_iterations_count(dirpath):
    directories = next(os.walk(dirpath))[1]
    return len(directories)




def build_polymorphic_relations(filepath: str) -> List[PolymorphicRelation]:
    regex = r'(.*) is a sub-class of (.*).'

    relations: List[PolymorphicRelation] = []

    with open(filepath, 'r') as file:
        lines = file.readlines()
        for i in range(len(lines)):
            line = lines[i]

            mtch = re.match(regex, line)

            if mtch:
                fqn_derived = mtch.group(1)
                fqn_base = mtch.group(2)

                relations.append(PolymorphicRelation(
                    derived=Klass(fqn_derived),
                    base=Klass(fqn_base),
                ))
            else:
                print(f"WARNING: line {i} does not contain polymorphic relation")

    return relations



def find_used_feedback_cycle_iterations_count(filepath: str) -> Tuple[int, int]:
    """
    Returns a tuple where the 1st component is 'used feedback cycle iterations',
    and the 2nd is 'total feedback cycle iterations'.
    """
    feedback_cycle_attempt_prefix: str = "============================== Feedback Cycle Iteration "
    feedback_cycle_attempt_pattern = r'.*(\d+)/(\d+).*'

    with open(filepath, 'r') as file:
        lines = file.readlines()
        feedback_cycle_attempts_used: int = 0
        feedback_cycle_attempts_total: int = 0

        for line in lines:
            if line.startswith(feedback_cycle_attempt_prefix):
                matches = re.findall(feedback_cycle_attempt_pattern, line)
                assert(matches)
                a, b = matches[0]
                feedback_cycle_attempts_used = int(a)
                feedback_cycle_attempts_total = int(b)

    return (feedback_cycle_attempts_used, feedback_cycle_attempts_total)



def line_contains_klass(line: str, klass: Klass) -> bool:
    # direct instantiation
    direct_instatitiation_pattern = r'.*=.*new (.*\.)??(\w+)(?:<\w*?>)?\(.*\);' # r'.*=.*new (.*\.)??(\w+)\(.*\);'
    direct_instatitiation_match = re.match(direct_instatitiation_pattern, line)

    if direct_instatitiation_match:
        matched_klass = direct_instatitiation_match.group(2)
        if (klass.name == matched_klass):
            return True


    # static method call
    static_method_call_pattern = r'.*\b(\w+?)\.\w+\(.*\)'
    static_method_call_match = re.match(static_method_call_pattern, line)

    if static_method_call_match:
        matched_call_context = static_method_call_match.group(1)
        if (klass.name == matched_call_context):
            return True


    # static member access
    static_member_access_pattern = r'.*?((?:\w+?\.)*)(\w+)(?!\.\w+\(.*\))\.\w+'
    static_member_access_match = re.match(static_member_access_pattern, line)

    if static_member_access_match:
        packages = static_member_access_match.group(1).split('.')
        matched_klass = static_member_access_match.group(2)

        if (klass.name in packages) or (klass.name == matched_klass):
            return True

    return False



def find_polymorphism_relations_use_in_llm_response(
        polymorphism_relations: List[PolymorphicRelation],
        llm_response_filepath: str
) -> List[PolymorphicRelationUse]:
    feedback_cycle_attempt_separator = \
        "============================================================================================================"
    current_feedback_cycle_attempt = 1

    uses: List[PolymorphicRelationUse] = []

    with open(llm_response_filepath, 'r') as file:
        lines = file.readlines()

        for i in range(len(lines)):
            line = lines[i]

            if line.startswith(feedback_cycle_attempt_separator):
                current_feedback_cycle_attempt += 1
                # if current_feedback_cycle_attempt == 2:
                    # print()
                continue

            for relation in polymorphism_relations:
                # if (not line.startswith("import")) and (relation.derived.name in line): # or (relation.base.name in line):
                if line_contains_klass(line, relation.derived):
                    # if current_feedback_cycle_attempt == 1:
                        # print(f"Contains '{relation.derived.name}': '{line[:-1]}'")

                    uses.append(PolymorphicRelationUse(
                        relation_used=relation,
                        feedback_cycle_iteration=current_feedback_cycle_attempt,
                        line_index=i,
                    ))
    return uses


def collect_polymorphism_summary(polymorphism_relations_uses: List[PolymorphicRelationUse]) -> Dict[int, List[RelationUseCount]]:
    """
    summary: { feedback_cycle_attempt -> (PolymorphicRelation, use count) }
    """
    summary: Dict[int, List[RelationUseCount]] = dict()

    for use in polymorphism_relations_uses:
        if use.feedback_cycle_iteration not in summary:
            summary[use.feedback_cycle_iteration] = []

        # relation use count already present in the list
        relation_use_count = [c for c in summary[use.feedback_cycle_iteration] if c.relation == use.relation_used]

        if len(relation_use_count) > 0:
            relation_use_count[0].count += 1
        else:
            summary[use.feedback_cycle_iteration].append(RelationUseCount(
                relation=use.relation_used,
                count=1
            ))
    return summary





def output_data_in_file(
    file,
    as_summary: bool,
    feedback_cycle_iterations_used: int,
    feedback_cycle_iterations_total: int,
    polymorphism_relations_uses: List[PolymorphicRelationUse],
):
    file.write(f"Feedback Cycles (Used/Total): {feedback_cycle_iterations_used}/{feedback_cycle_iterations_total}\n")

    if as_summary is False:
        file.write("Polymorphism relations used (Base,Derived,Feedback Cycle Attempt,Line Number):\n")

        for use in polymorphism_relations_uses:
            fqn_base = use.relation_used.base.fqn()
            fqn_derived = use.relation_used.derived.fqn()
            file.write(f"\t{fqn_base},{fqn_derived},{use.feedback_cycle_iteration},{use.line_index+1}\n")
        file.write("\n")

    else:
        file.write("Polymorphism relations used: for every feedback cycle attempt (Base,Derived,Count):\n")
        # { feedback_cycle_attempt -> (PolymorphicRelation, use count) }
        summary: Dict[int, List[RelationUseCount]] = collect_polymorphism_summary(polymorphism_relations_uses)

        for feedback_cycle_attempt, relation_use_counts in summary.items():
            file.write(f"\tCurrent Feedback Cycle Attempt: {feedback_cycle_attempt}\n")

            for c in relation_use_counts:
                fqn_base = c.relation.base.fqn()
                fqn_derived = c.relation.derived.fqn()
                file.write(f"\t\t{fqn_base},{fqn_derived},{c.count}\n")


@dataclass
class UseInfo:
    use_sum: int
    count: int


def main(dirpath: str, project_id: str, prompt_label: str, input_filepath: str, output_filepath: str, max_iterations: int, as_summary: bool):
    polymorphic_relations: List[PolymorphicRelation] = build_polymorphic_relations(input_filepath)
    iterations_count: int = get_generation_iterations_count(dirpath)

    if max_iterations < iterations_count:
        iterations_count = max_iterations

    feedback_cycle_iterations_used_sum = 0
    # polymorphism uses count of the final feedback cycle attempts of each unit test generation iteration
    polymorphism_uses: Dict[PolymorphicRelation, UseInfo] = dict()

    with open(output_filepath, 'w') as output:
        output.write(f"Project id: '{project_id}'\n")
        output.write(f"Prompt label: '{prompt_label}'\n\n")

        for iteration in range(iterations_count):
            project_dirpath: str = os.path.join(dirpath, str(iteration), project_id)

            output.write(f"======================== Iteration {iteration}/{iterations_count} ========================\n")

            # find the iterations count
            test_generation_filepath: str = os.path.join(project_dirpath, 'generated-artifacts', 'test-generation.log')
            feedback_cycle_iterations_used, feedback_cycle_iterations_total = \
                    find_used_feedback_cycle_iterations_count(test_generation_filepath)

            llm_responses_filepath: str = os.path.join(project_dirpath, 'generated-artifacts', 'llm-responses.txt')
            polymorphism_relations_uses: List[PolymorphicRelationUse] = \
                find_polymorphism_relations_use_in_llm_response(
                    polymorphic_relations,
                    llm_responses_filepath,
                )

            output_data_in_file(
                file=output,
                as_summary=as_summary,
                feedback_cycle_iterations_used=feedback_cycle_iterations_used,
                feedback_cycle_iterations_total=feedback_cycle_iterations_total,
                polymorphism_relations_uses=polymorphism_relations_uses,
            )
            output.write("\n")

            # collect data to find avg feedback cycles attempts + avg use of polymorphic relations on the final feedback cycle iteration
            feedback_cycle_iterations_used_sum += feedback_cycle_iterations_used

            summary: Dict[int, List[RelationUseCount]] = collect_polymorphism_summary(polymorphism_relations_uses)

            if feedback_cycle_iterations_used not in summary:
                print(f"feedback_cycle_iterations_used={feedback_cycle_iterations_used} not present in summary: {summary}")
                print(f"polymorphism_relations_uses: {polymorphism_relations_uses}")
                continue

            for c in summary[feedback_cycle_iterations_used]:
                if c.relation not in polymorphism_uses:
                    polymorphism_uses[c.relation] = UseInfo(
                        use_sum=c.count,
                        count=1,
                    )
                else:
                    polymorphism_uses[c.relation].use_sum += c.count
                    polymorphism_uses[c.relation].count += 1

        avg_feedback_cycle_iterations_used = feedback_cycle_iterations_used_sum / iterations_count
        output.write(f"\nAverage feedback cycle attempts used: {avg_feedback_cycle_iterations_used}\n")

        output.write("Average polymorphic relations uses (accouting the last feedback cycle attempts):\n")
        output.write("Base,Derived,Use sum,Use Count,Avg Use Among All Iterations\n")

        sorted_relations = sorted(polymorphism_uses.keys())

        for relation in sorted_relations:
            info = polymorphism_uses[relation]

            avg_use = info.use_sum / iteration # info.count

            fqn_base = relation.base.fqn()
            fqn_derived = relation.derived.fqn()

            output.write(f"\t{fqn_base},{fqn_derived},{info.use_sum},{info.count},{avg_use}\n")







if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Process command line arguments.")
    parser.add_argument("-d", "--dirpath", type=str, required=True, help="Dirpath to TestSpark generation folder")
    parser.add_argument("-p", "--project-id", type=str, required=True, help="Project id that should be scaned")
    parser.add_argument("-P", "--prompt-label", type=str, required=True, help="Label of a type of prompt used for the unit test generation")
    parser.add_argument("-i", "--input-filepath", type=str, required=True, help="Filepath to the input file containing polymorphic relations")
    parser.add_argument("-m", "--max-iterations", type=int, required=False, default=int(1e9), help="Max number of iterations, i.e. iterations in range [0, max-iterations)")
    parser.add_argument("-o", "--output-filepath", type=str, required=True, help="Filepath where to save the data")
    parser.add_argument("-s", "--summary", action='store_true', help="If provided then the polymorphic relations are presented as a summary, i.e. instead of providing info about every use only the total number of uses written to the output file")

    args = parser.parse_args()

    main(
        dirpath = args.dirpath,
        project_id = args.project_id,
        prompt_label = args.prompt_label,
        input_filepath = args.input_filepath,
        output_filepath = args.output_filepath,
        max_iterations = args.max_iterations,
        as_summary = args.summary,
    )

# python ./research/scripts/misc/find_polymorphism_use.py -d /home/ubuntu/projects/tga-pipeline/artifacts/generation-2/augmented-prompt-polymorphism-only/TestSpark -p jsoup-1119192565 -o /home/ubuntu/projects/temp.csv -i /home/ubuntu/projects/polymorphic_relations.txt  -P augmented-prompt-polymorphism-only -s