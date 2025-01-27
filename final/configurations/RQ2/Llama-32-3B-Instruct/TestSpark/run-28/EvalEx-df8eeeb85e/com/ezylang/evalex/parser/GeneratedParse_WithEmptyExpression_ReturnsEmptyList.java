package com.ezylang.evalex.parser;

public class GeneratedParse_WithEmptyExpression_ReturnsEmptyList {

    @Test
    public void parse_WithEmptyExpression_ReturnsEmptyList() {
        // Given
        String expressionString = "";
        ExpressionConfiguration configuration = new ExpressionConfiguration();

        // When
        List<Token> tokens = tokenizer.parse(expressionString, configuration);

        // Then
        assertTrue(tokens.isEmpty());
    }

}