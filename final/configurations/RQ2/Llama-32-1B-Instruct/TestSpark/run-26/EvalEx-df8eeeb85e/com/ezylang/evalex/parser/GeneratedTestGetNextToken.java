package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetNextToken {

    @Test
    public void testGetNextToken() {
        String input = "1 + 2";
        String[] output = Tokenizer.nextToken(input);
        assertEquals("Number", output[0]);
        assertEquals("+", output[1]);
        assertEquals("Number", output[2]);
        assertEquals(2, output[3].getLength());
    }

}