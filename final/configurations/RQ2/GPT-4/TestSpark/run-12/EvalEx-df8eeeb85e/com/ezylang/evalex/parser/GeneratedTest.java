package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseSyntaxErrorExceptionTest() {
        String expressionString = "2+2/";
        Tokenizer tokenizer = new Tokenizer(expressionString, null);

        try {
            tokenizer.parse();
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
            assertTrue(e.getMessage().contains("Syntax error"));
        }
    }

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