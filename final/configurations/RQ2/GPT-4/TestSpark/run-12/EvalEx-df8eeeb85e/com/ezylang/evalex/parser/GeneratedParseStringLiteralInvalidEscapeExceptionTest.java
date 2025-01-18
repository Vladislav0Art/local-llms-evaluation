package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseStringLiteralInvalidEscapeExceptionTest {

    @Test
    public void parseStringLiteralInvalidEscapeExceptionTest() {
        String expressionString = "\"invalid\\escape\"";
        Tokenizer tokenizer = new Tokenizer(expressionString, null);

        try {
            tokenizer.parseStringLiteral();
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("Invalid escape"));
        }
    }

}