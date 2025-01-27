package com.ezylang.evalex.parser;

public class GeneratedParse_WithSingleLiteral_ReturnsCorrectToken {

    @Test
    public void parse_WithSingleLiteral_ReturnsCorrectToken() {
        // Given
        String expressionString = "1";
        ExpressionConfiguration configuration = new ExpressionConfiguration();

        // When
        List<Token> tokens = tokenizer.parse(expressionString, configuration);

        // Then
        assertEquals(1, tokens.size());
        assertTrue(tokens.get(0).type == TokenType.LITERAL);
    }

}