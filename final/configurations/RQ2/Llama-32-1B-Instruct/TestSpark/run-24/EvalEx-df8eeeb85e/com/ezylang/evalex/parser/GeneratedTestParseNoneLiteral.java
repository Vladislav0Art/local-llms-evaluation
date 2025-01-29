package com.ezylang.evalex.parser;

import org.junit.After;

import static org.junit.Assert.*;

public class GeneratedTestParseNoneLiteral {

    @After
    public void tearDown() {
        // Delete all intermediate configurations
    }

    @Test
    public void testParseNoneLiteral() {
        assertTrue(tokenizer.parse("None").isEmpty());
    }

}