package com.ezylang.evalex.parser;

import org.junit.After;

import static org.junit.Assert.*;

public class GeneratedTestParseStringWithPunctuation {

    @After
    public void tearDown() {
        // Delete all intermediate configurations
    }

    @Test
    public void testParseStringWithPunctuation() {
        assertTrue(tokenizer.parse("a,b,c").isEmpty());
    }

}