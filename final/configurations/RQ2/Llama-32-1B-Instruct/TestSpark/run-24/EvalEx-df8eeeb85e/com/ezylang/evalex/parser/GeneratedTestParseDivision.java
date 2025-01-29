package com.ezylang.evalex.parser;

import org.junit.After;

import static org.junit.Assert.*;

public class GeneratedTestParseDivision {

    @After
    public void tearDown() {
        // Delete all intermediate configurations
    }

    @Test
    public void testParseDivision() {
        assertTrue(tokenizer.parse("1/2").isEmpty());
    }

}