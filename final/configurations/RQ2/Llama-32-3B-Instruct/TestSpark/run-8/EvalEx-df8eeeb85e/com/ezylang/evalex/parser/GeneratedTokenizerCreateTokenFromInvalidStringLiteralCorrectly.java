package com.ezylang.evalex.parser;

public class GeneratedTokenizerCreateTokenFromInvalidStringLiteralCorrectly {

    @Test
    public void tokenizerCreateTokenFromInvalidStringLiteralCorrectly() {
        // Arrange
        String expressionString = "a";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        configuration.setFunctionDictionaryIfc(new FunctionDictionaryIfc());
        configuration.setOperatorDictionaryIfc(new OperatorDictionaryIfc());

        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        List<Token> tokens = tokenizer.parse();

        // Assert
        assertEquals(1, tokens.size());
        assertTrue(tokens.get(0).getType() == TokenType.ERROR);
    }

}