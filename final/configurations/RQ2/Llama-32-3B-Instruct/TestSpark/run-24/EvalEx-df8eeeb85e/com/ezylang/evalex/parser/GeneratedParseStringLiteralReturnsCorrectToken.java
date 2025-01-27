package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

import static com.ezylang.evalex.parser.Token.TokenType.*;

public class GeneratedParseStringLiteralReturnsCorrectToken {

    @Test
    public void parseStringLiteralReturnsCorrectToken() throws ParseException {
        String expressionString = "\"hello\"";
        Token token = new Tokenizer(expressionString).parseStringLiteral();
        assertTrue(token.getType() == STRING);
        assertEquals("hello", token.getValue());
    }

}