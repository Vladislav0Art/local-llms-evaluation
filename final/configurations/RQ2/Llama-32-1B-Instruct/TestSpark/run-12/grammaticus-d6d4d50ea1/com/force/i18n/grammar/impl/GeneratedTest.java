package com.force.i18n.grammar.impl;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedTest {

    public static String getTestData() {
        return "test data";
    }

    public void testGetTestData() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);
        System.setOut(out);
        String result = testGenerateGrammar();
        System.out.println(result);
        out.close();
        testGetTestData();
    }
}

public class GeneratedTest extends TestCase {

    @Before
    public void setup() {
        // No need to set anything up here, tests are run once at start
    }

}