package com.ezylang.evalex.parser;

import org.junit.After;

import static org.junit.Assert.*;

public class GeneratedTestParseEmptyExpression {

    @After
    public void tearDown() {
        // Delete all intermediate configurations
    }

    @Test
    public void testParseEmptyExpression() {
        assertTrue(tokenizer.parse("")).isEmpty();
    }

}