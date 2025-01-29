package com.ezylang.evalex.parser;

import org.junit.After;

import static org.junit.Assert.*;

public class GeneratedTestParseStringWithoutPunctuation {

    @After
    public void tearDown() {
        // Delete all intermediate configurations
    }

    @Test
    public void testParseStringWithoutPunctuation() {
        assertTrue(tokenizer.parse("a,b").isEmpty());
    }

}