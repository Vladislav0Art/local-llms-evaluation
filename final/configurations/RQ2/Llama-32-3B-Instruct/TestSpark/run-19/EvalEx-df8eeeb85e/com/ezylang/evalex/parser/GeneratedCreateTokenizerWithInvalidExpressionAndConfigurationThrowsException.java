package com.ezylang.evalex.parser;

public class GeneratedCreateTokenizerWithInvalidExpressionAndConfigurationThrowsException {

    @Test
    public void createTokenizerWithInvalidExpressionAndConfigurationThrowsException() {
        // Arrange
        String expressionString = "";
        Tokenizer.Configuration configuration = new Tokenizer(Configuration());

        // Act and Assert
        try {
            Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
            fail("Expected exception to be thrown");
        } catch (Exception e) {
            assertEquals("Invalid input", e.getMessage());
        }
    }

}

public class Tokenizer {

    public static class Configuration {
        // fields and methods
    }

    public Tokenizer(String expression, Configuration configuration) throws Exception {
        // implementation
    }

    public void tokenize() throws Exception {
        // implementation
    }

}