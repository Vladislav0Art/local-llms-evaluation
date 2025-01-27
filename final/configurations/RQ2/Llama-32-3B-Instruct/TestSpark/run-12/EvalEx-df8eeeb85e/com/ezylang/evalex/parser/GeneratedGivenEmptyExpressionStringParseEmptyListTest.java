package com.ezylang.evalex.parser;

public class GeneratedGivenEmptyExpressionStringParseEmptyListTest {

    @Test
    public void givenEmptyExpressionStringParseEmptyListTest() {
        // Arrange
        String expressionString = "";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        configuration.setFunctionDictionaryIfc(new FunctionDictionaryIfc());
        configuration.setOperatorDictionaryIfc(new OperatorDictionaryIfc());

        // Act
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();

        // Assert
        assertTrue(tokens.isEmpty());
    }

}