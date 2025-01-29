package com.ezylang.evalex.parser;

import org.junit.After;

import static org.junit.Assert.*;

public class GeneratedTestParseIntegers {

    @After
    public void tearDown() {
        // Delete all intermediate configurations
    }

    @Test
    public void testParseIntegers() {
        assertEquals(Arrays.asList("1", "2"), tokenizer.parse("1,2"));
    }

}