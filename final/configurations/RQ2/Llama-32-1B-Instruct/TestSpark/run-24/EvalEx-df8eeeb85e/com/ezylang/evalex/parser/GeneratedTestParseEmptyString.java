package com.ezylang.evalex.parser;

import org.junit.After;

import static org.junit.Assert.*;

public class GeneratedTestParseEmptyString {

    @After
    public void tearDown() {
        // Delete all intermediate configurations
    }

    @Test
    public void testParseEmptyString() {
        assertTrue(tokenizer.parse("").isEmpty());
    }

}