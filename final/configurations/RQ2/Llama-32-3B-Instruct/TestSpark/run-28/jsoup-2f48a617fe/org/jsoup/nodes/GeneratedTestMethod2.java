package org.jsoup.nodes;

public class GeneratedTestMethod2 {

    @Before
    public void setUp() {
        // setup
    }

    @Test
    public void testMethod2() {
        // given
        Object obj = new Object();

        // when
        // no implementation needed, just declare the method

        // then
        // no assertions needed
    }
}

public class PublicTestClass1 {
    private TestClass1 testClass1;

    @Before
    public void setUp() {
        this.testClass1 = new TestClass1();
    }

    @PublicTest
    public void testPublicMethod1() {
        // given
        Object obj = new Object();

        // when
        // no implementation needed, just declare the method

        // then
        // no assertions needed
    }

    @PublicTest
    public void testPublicMethod2() {
        // given
        Object obj = new Object();

        // when
        // no implementation needed, just declare the method

        // then
        // no assertions needed
    }
}

public class PublicTestClass2 {
    private final TestClass1 publicTestClass1;

    @Before
    public void setUp() {
        this.publicTestClass1 = new TestClass1();
    }

    @PublicTest
    public void testPublicMethod3() {
        // given
        Object obj = new Object();

        // when
        // no implementation needed, just declare the method

        // then
        // no assertions needed
    }

}