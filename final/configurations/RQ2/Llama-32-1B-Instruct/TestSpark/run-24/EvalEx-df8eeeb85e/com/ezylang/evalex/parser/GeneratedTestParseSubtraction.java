package com.ezylang.evalex.parser;

import org.junit.After;

import static org.junit.Assert.*;

public class GeneratedTestParseSubtraction {

    @After
    public void tearDown() {
        // Delete all intermediate configurations
    }

    @Test
    public void testParseSubtraction() {
        assertTrue(tokenizer.parse("a - b").isEmpty());
    }

}