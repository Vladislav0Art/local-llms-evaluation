package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetLengthOfToken {

    @Test
    public void testGetLengthOfToken() {
        String input = "1 + 2";
        int[] output = Tokenizer.nextToken(input).length();
        assertEquals(4, output[0]);
    }

}