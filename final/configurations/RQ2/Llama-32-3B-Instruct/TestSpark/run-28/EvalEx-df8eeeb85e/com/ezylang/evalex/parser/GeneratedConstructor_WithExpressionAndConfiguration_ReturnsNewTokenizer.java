package com.ezylang.evalex.parser;

public class GeneratedConstructor_WithExpressionAndConfiguration_ReturnsNewTokenizer {

    @Test
    public void constructor_WithExpressionAndConfiguration_ReturnsNewTokenizer() {
        // Given
        String expressionString = "1 + 2 * 3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();

        // When
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        // Then
        assertNotNull(tokenizer);
    }

}