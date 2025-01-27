package com.ezylang.evalex.parser;

public class GeneratedCreateTokenizerWithValidExpressionAndConfigurationDoesNotThrowAnyException {

    @Test
    public void createTokenizerWithValidExpressionAndConfigurationDoesNotThrowAnyException() {
        // Arrange
        String expressionString = "1 + 2 * 3";
        Tokenizer.Configuration configuration = new Tokenizer(Configuration());

        // Act
        try (Tokenizer tokenizer = new Tokenizer(expressionString, configuration)) {
            // Assert
            // code that verifies the tokenizer works correctly
        }
    }

}