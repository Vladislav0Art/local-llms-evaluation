package com.force.i18n.grammar.impl;

public class GeneratedTestGenerateGrammar {

    public String getTestData() {
        return "test data";
    }

    public void testGetTestData() {
        System.out.println(getTestData());
    }
}

public class GeneratedTest extends TestCase {

    @Before
    public void setup() {
        // No need to set anything up here, tests are run once at start
    }

    @Test
    public void testGenerateGrammar() {
        TestHelper helper = new TestHelper();
        String grammar = helper.getTestData();
        System.out.println(grammar);
        testGetTestData();
    }

}