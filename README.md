# Research Work: Analysis


Llama-70B:
I. RQ1-config-1 VS RQ1-config-2 (feedback-cycle, 5 iterations + CUT):

Projects: 13

Common Notes:
1. AI generated fully compilable test suites on the first iteration for almost all classes under test.
1. Very few generation sessions used feedback cycle functionality during test generation, thus no change in the final metrics.
1. For other generations, the many errors were 1) incorrect output (every test case in a code block); 2) refusal to fix compilation errors (this issue made feedback cycle impractical, as AI merely refused to proceed with further generation referring to violation of ethical and moral principles stating that the generated code may harm or exploit others or violate their privacy and security). This error is repeatable across many generation attempts, which is a completely abnormal behavior compared with other models.


Llama-8B:
I. RQ1-config-1 VS RQ1-config-2 (feedback-cycle, 5 iterations + CUT):

Projects:
	java-solutions-7a73ea56d0
	jsoup-9170b1d17b
	jsoup-a349582236
	jsoup-e1880ad73e


java-solutions-7a73ea56d0:
	1. In config-I AI generated the same test suite over and over with 100% compilation and line coverage. In config-II, it generated a different test suite, which had only 2 compilable test cases (the same test suite over 15 iterations again!).
	1. In other words, degration has non-feedback cycle nature.

jsoup-9170b1d17b:
	1. Successful generation of unit tests for class with 528 lines of code; no additional iterations of the feedback cycle used.

jsoup-a349582236:
	1. Feedback-cycle used 3 times and allowed to avoid 2 compilation errors in tests:
		- Call of a private constructor (`new Tag("p")` instead of `Tag.valueOf("p")`)
		- Call of a non-existing constructor (`new ParseSettings()` instead of `new ParseSettings(Bool, Bool)`).
	1. Both compilation errors were removed (1 on each iteration cycle) => all test cases are compilable + higher coverage.
	1. Without feedback-cycle, only 2 test cases that didn't use wrong instantiation tested only 2 class methods.

jsoup-e1880ad73e:
	1. UrlBuilder is the class under test. AI received information about the following methods:
		- UrlBuilder(URL)
		- URL build()
		- void appendKeyVal(Connection.KeyVal kv)
	1. However, `appendKeyVal` was never called; likely, because AI did not have any information how to instantiate its parameter.
	1. Feedback-cycle was not used in this case.





Llama-3B:
I. RQ1-config-1 VS RQ1-config-2 (feedback cycle, 5 iterations, CUT):

Projects:
	ConfigMe-7449db4901
	java-solutions-7a73ea56d0
	jsoup-2f48a617fe
	jsoup-c507588b5c

Common Notes:
	1. Due to feedback cycle being used, the avg. number of generated test cases are as follows:
		- With feedback cycle: 12.13
		- Without feedback cycle: 8.83
	   Yet, the number of compilable test cases does not rise proportionally to the number of all test cases:
	   	- With feedback cycle: 4.83
	   	- Without feedback cycle: 5.11
   	1. It suggests that the quality of reasoning for models of size smaller than 8B degrates gradually until reaches the point where additional feedback iterations no longer bring positive results.
   	1. No syntax errors in code other than unclosed closing curly brace of the test suite at the end.
   	1. Use of non-existing methods of the Java standard library.

ConfigMe-7449db4901:
	1. Use of private field; compilation error feedback made AI implement its own instance of the class under test (incorrectly).
	1. Use of non-existing annotations: @PublicConstructor, @PublicMethod.
	1. Use of non-existing constructor. Very simple class with a default constructor is given, yet it cannot instantiate it correctly.
	1. To fix compilation errors, AI tries to implement the class under test in the same file where the test suite is stored. It causes class/file naming compilation error, which AI cannot fix.
	1. Further after 3rd feedback cycle iteration, AI only outputs the self-implemented class under test (no test suite) -> TestSpark does not locate test cases anymore.


java-solutions-7a73ea56d0:
	1. Feedback cycle had a slight positive impact on the compilation rate (+4.41%):
		- With feedback cycle:
			- Total test cases: 8.26
			- Compilable test cases: 6.58
		- Without feedback cycle:
			- Total test cases: 7.89
			- Compilable test cases: 5.89
		* Change in compilation ratio: +5% (6.58/8.26 - 5.89/7.89 = 0.0501 -> 5%)
	1. Missing imports, missing @Test annotations.


jsoup-2f48a617fe:
	1. Feedback cycle does not cause any positive impact: AI starts to provide definitions of the class under test and/or defintions of the class-like method parameters. This behavior starts right from the 2nd iteration.


jsoup-c507588b5c:
	1. Use of non-imported classes, namely IOException, and non-existent (unfound symbols "cannot find symbol") classes. Does not include imports of IOException / defines classes that were mentioned as unfound.
	1. Further iterations make it omit producing/modifying the test suite but output the definitions of the classes under test of their class-like method parameters.






Llama-1B:
1. Bigger projects caused severe hallucinations on the very first iteration: producing `Main` functions with no reason, implementing the classes under test or their class-like method parameters.
1. It clearly suggests that this model, and likely models lower than 3B, are not smart enough to reason even only about provided classes under test. The additional compilation feedback does not bring any useful information for the AI in these cases.

1. We will consider the projects, which had successful generation attempts on Llama-3B:

Common: after the first/second feedback cycle iteration, AI starts to produce `Main` functions, implement the classes under test or their method parameters and behave similarly when generating tests for bigger projects.

java-solutions-7a73ea56d0:
	1. No imports inserted in the resulting test suite. Feedback cycle makes it write a defintion of the class under test and after produce non test generation related output. It is the main reason of compilation failure; further feedback cycles do not cause AI generate imports.

jsoup-2f48a617fe:
	1. No imports generated.
	1. Illegal syntax in Java.


jsoup-c507588b5c:
	1. Missing imports.
	2. Non-feedback related response.

jsoup-9170b1d17b:
	1. Similar problems.




