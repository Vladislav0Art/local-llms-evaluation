package com.ezylang.evalex.parser;

public class GeneratedParseStringLiteral_WithOperator_ReturnsCorrectToken {

    @Test
    public void parseStringLiteral_WithOperator_ReturnsCorrectToken() {
        // Given
        String expressionString = "1 +";
        Tokenizer tokenizer = new Tokenizer(expressionString, new ExpressionConfiguration());

        // When
        Token token = tokenizer.parseStringLiteral();

        // Then
        assertTrue(token.type == TokenType.OPERATOR);
    }

}