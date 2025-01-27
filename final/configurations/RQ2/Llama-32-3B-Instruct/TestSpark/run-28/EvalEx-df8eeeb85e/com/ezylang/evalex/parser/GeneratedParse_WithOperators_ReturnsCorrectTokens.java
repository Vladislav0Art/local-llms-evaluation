package com.ezylang.evalex.parser;

public class GeneratedParse_WithOperators_ReturnsCorrectTokens {

    @Test
    public void parse_WithOperators_ReturnsCorrectTokens() {
        // Given
        String expressionString = "1 + 2 * 3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();

        // When
        List<Token> tokens = tokenizer.parse(expressionString, configuration);

        // Then
        assertEquals(4, tokens.size());
        assertTrue(tokens.get(0).type == TokenType.LITERAL);
        assertTrue(tokens.get(1).type == TokenType.OPERATOR);
        assertTrue(tokens.get(2).type == TokenType.LITERAL);
        assertTrue(tokens.get(3).type == TokenType.OPERATOR);
    }

}