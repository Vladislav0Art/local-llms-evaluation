package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetNumberTokensWithNoOperation {

    private Tokenizer tokenizer;

    @Test
    public void testGetNumberTokensWithNoOperation() {
        tokenizer = new Tokenizer();
        String input = "1 + 2";
        tokenizer.nextToken(input);
        assertEquals("", input);
    }

}