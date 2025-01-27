package com.ezylang.evalex.parser;

public class GeneratedTokenizerParseMultipleOperatorsCorrectly {

    @Test
    public void tokenizerParseMultipleOperatorsCorrectly() {
        // Arrange
        String expressionString = "5 + 3 * 2";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        configuration.setFunctionDictionaryIfc(new FunctionDictionaryIfc());
        configuration.setOperatorDictionaryIfc(new OperatorDictionaryIfc());

        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        List<Token> tokens = tokenizer.parse();

        // Assert
        assertEquals(3, tokens.size());
        assertTrue(tokens.get(0).getType() == TokenType.NUMBER);
        assertTrue(tokens.get(1).getType() == TokenType.MULTIPLICATION);
        assertTrue(tokens.get(2).getType() == TokenType.ADDITION);
    }

}