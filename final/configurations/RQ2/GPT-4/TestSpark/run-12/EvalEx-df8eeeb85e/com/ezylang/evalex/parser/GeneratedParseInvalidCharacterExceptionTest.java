package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseInvalidCharacterExceptionTest {

    @Test
    public void parseInvalidCharacterExceptionTest() {
        String expressionString = "2+2#";
        Tokenizer tokenizer = new Tokenizer(expressionString, null);

        try {
            tokenizer.parse();
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("Invalid character"));
        }
    }

}