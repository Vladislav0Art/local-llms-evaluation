from dataclasses import dataclass
from typing import Dict



@dataclass
class CoverageResult:
    covered: int
    total: int


@dataclass
class CompilabilityResult:
    compilable_test_cases_count: int
    total_test_cases_count: int
    # compilable_test_cases_filepaths: List[str]


@dataclass
class ProjectData:
    iterations_count: int                           # number of iterations of test generation
    klass: str                                      # fully quialified name of a class under test
    instructions: Dict[int, CoverageResult]         # iteration -> CoverageResult
    lines: Dict[int, CoverageResult]                # iteration -> CoverageResult
    branches: Dict[int, CoverageResult]             # iteration -> CoverageResult
    compilabilities: Dict[int, CompilabilityResult] # iteration -> CompilabilityResult

