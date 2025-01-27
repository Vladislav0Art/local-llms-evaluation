package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedParseStringLiteralMethod_ReturnsTokenWith quotes_WhenExpressionStringContainsQuotes {

    @Test
    public void parseStringLiteralMethod_ReturnsTokenWith

    quotes_WhenExpressionStringContainsQuotes() {
        String expressionString = "\"hello\"";
        try {
            Token token = new Tokenizer(expressionString).parseStringLiteral();
            assertEquals(TokenType.STRING_LITERAL, token.getType());
            assertEquals("hello", token.getValue());
        } catch (ParseException e) {
            fail("Expected ParseException to be thrown");
        }
    }

}