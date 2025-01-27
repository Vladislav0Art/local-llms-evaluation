package com.ezylang.evalex.parser;

public class GeneratedParse_WithMultipleLiterals_ReturnsCorrectTokens {

    @Test
    public void parse_WithMultipleLiterals_ReturnsCorrectTokens() {
        // Given
        String expressionString = "1 2 3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();

        // When
        List<Token> tokens = tokenizer.parse(expressionString, configuration);

        // Then
        assertEquals(3, tokens.size());
        assertTrue(tokens.get(0).type == TokenType.LITERAL);
        assertTrue(tokens.get(1).type == TokenType.LITERAL);
        assertTrue(tokens.get(2).type == TokenType.LITERAL);
    }

}