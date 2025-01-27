package com.ezylang.evalex.parser;

public class GeneratedParseStringLiteral_WithLiteral_ReturnsCorrectToken {

    @Test
    public void parseStringLiteral_WithLiteral_ReturnsCorrectToken() {
        // Given
        String literal = "1";
        Tokenizer tokenizer = new Tokenizer(literal, new ExpressionConfiguration());

        // When
        Token token = tokenizer.parseStringLiteral();

        // Then
        assertEquals(1, token.value);
        assertTrue(token.type == TokenType.LITERAL);
    }

}