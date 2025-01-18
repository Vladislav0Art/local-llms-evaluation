package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseStringLiteralPrematureEndExceptionTest {

    @Test
    public void parseStringLiteralPrematureEndExceptionTest() {
        String expressionString = "\"premature end";
        Tokenizer tokenizer = new Tokenizer(expressionString, null);

        try {
            tokenizer.parseStringLiteral();
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("Premature end of string"));
        }
    }

}