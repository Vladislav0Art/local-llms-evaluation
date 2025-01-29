package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetNextTokenWithNoOperation {

    @Test
    public void testGetNextTokenWithNoOperation() {
        String input = "1 + 2";
        Tokenizer.nextToken(input);
        assertEquals("", input);
    }

}