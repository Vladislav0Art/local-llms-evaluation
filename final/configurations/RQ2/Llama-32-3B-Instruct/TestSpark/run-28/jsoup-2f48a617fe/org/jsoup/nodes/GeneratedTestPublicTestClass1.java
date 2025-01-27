package org.jsoup.nodes;

public class GeneratedTestPublicTestClass1 {

    private String testAttribute;

    public TestClass1() {
        this.testAttribute = "TestAttribute";
    }

    public void printAttribute() {
        System.out.println(testAttribute);
    }
}

public class PublicTestClass1 {
    public TestClass1 testClass1;

    @PublicTest
    public void setTestClass1(TestClass1 testClass1) {
        this.testClass1 = testClass1;
    }

    public void printTestClass1() {
        if (testClass1 != null) {
            System.out.println(testClass1.testAttribute);
        } else {
            System.out.println("No TestClass1 assigned");
        }
    }
}

public class PublicTestClass2 {
    private final TestClass1 testClass1;

    @PublicTest
    public void setTestClass1(TestClass1 testClass1) {
        this.testClass1 = testClass1;
    }

    public String getTestClass1() {
        return testClass1 != null ? testClass1.testAttribute : "No TestClass1 assigned";
    }
}

public class GeneratedTest {
    private final TestClass2 testClass2;

    @Before
    public void setUp() {
        this.testClass2 = new TestClass2();
    }

    @Test
    public void testPublicTestClass1() {
        PublicTestClass1 publicTestClass1 = new PublicTestClass1();
        publicTestClass1.setTestClass1(new TestClass1());
        publicTestClass1.printTestClass1();
    }

}