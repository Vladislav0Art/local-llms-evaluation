package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedParseStringLiteralReturnsCorrectTokenType {

    @Test
    public void parseStringLiteralReturnsCorrectTokenType() {
        // Arrange
        String stringLiteral = "\"hello\"";
        Tokenizer tokenizer = new Tokenizer(stringLiteral, new ExpressionConfiguration());

        // Act
        Token token = tokenizer.parseStringLiteral();

        // Assert
        assertEquals(STRING_LITERAL, token.getType());
    }

}