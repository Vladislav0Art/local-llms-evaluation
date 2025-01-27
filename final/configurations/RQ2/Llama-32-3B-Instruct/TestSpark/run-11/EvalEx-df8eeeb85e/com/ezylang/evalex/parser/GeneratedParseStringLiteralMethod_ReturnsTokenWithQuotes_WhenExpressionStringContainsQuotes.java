package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedParseStringLiteralMethod_ReturnsTokenWithQuotes_WhenExpressionStringContainsQuotes {

    @Test
    public void parseStringLiteralMethod_ReturnsTokenWithQuotes_WhenExpressionStringContainsQuotes() {
        String expressionString = "\"hello\"";
        try {
            Tokenizer tokenizer = new Tokenizer(expressionString);
            Token token = tokenizer.parseStringLiteral();
            assertEquals(TokenType.STRING_LITERAL, token.getType());
            assertEquals("hello", token.getValue());
        } catch (ParseException e) {
            fail("Expected ParseException to be thrown");
        }
    }

}