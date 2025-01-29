package com.ezylang.evalex.parser;

import org.junit.After;

import static org.junit.Assert.*;

public class GeneratedTestParseFloats {

    @After
    public void tearDown() {
        // Delete all intermediate configurations
    }

    @Test
    public void testParseFloats() {
        assertEquals(Arrays.asList("3.14f", "4.71f"), tokenizer.parse("3.14f 4.71f"));
    }

}