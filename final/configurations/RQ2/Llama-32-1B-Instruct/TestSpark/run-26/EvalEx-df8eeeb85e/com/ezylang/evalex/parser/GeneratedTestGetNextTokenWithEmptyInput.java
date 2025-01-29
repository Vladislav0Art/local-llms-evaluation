package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetNextTokenWithEmptyInput {

    @Test
    public void testGetNextTokenWithEmptyInput() {
        String input = "";
        try {
            Tokenizer.nextToken(input);
        } catch (Exception e) {
            // expected behavior
        }
    }

}