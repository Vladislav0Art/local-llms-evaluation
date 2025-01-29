package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetNumberTokens {

    private Tokenizer tokenizer;

    @Test
    public void testGetNumberTokens() {
        tokenizer = new Tokenizer();
        String input = "1 + 2";
        String[] output = tokenizer.nextToken(input);
        assertEquals("Number", output[0]);
        assertEquals(1, output[1].getLength());
        assertEquals("+", output[2]);
        assertEquals("Number", output[3]);
    }

}