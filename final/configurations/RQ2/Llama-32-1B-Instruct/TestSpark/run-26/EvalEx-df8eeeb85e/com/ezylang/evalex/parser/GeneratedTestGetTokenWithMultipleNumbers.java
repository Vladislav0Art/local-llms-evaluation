package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetTokenWithMultipleNumbers {

    @Test
    public void testGetTokenWithMultipleNumbers() {
        String input = "1 + 2 + 3";
        assertEquals("Number, +, Number, 1, Number, 2, Number, 3", Tokenizer.nextToken(input));
    }

}