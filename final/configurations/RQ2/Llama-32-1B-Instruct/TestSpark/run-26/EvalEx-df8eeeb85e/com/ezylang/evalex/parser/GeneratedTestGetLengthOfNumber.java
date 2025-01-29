package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetLengthOfNumber {

    @Test
    public void testGetLengthOfNumber() {
        String input = "1 + 2";
        int[] output = Tokenizer.nextToken(input).length();
        assertEquals(5, output[0]);
    }

}