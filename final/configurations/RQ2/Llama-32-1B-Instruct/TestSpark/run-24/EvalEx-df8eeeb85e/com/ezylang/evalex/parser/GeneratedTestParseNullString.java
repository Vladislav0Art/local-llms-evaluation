package com.ezylang.evalex.parser;

import org.junit.After;

import static org.junit.Assert.*;

public class GeneratedTestParseNullString {

    @After
    public void tearDown() {
        // Delete all intermediate configurations
    }

    @Test
    public void testParseNullString() {
        assertTrue(tokenizer.parse("null").isEmpty());
    }

}