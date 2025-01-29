package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetToken {

    @Test
    public void testGetToken() {
        String input = "1 + 2";
        assertEquals("Number, +, Number, 2, Number", Tokenizer.nextToken(input));
    }

}