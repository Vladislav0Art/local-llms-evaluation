package com.ezylang.evalex.parser;

public class GeneratedGivenExpressionStringParseSingleTokenTest {

    @Test
    public void givenExpressionStringParseSingleTokenTest() {
        // Arrange
        String expressionString = "hello";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        configuration.setFunctionDictionaryIfc(new FunctionDictionaryIfc());
        configuration.setOperatorDictionaryIfc(new OperatorDictionaryIfc());

        // Act
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();

        // Assert
        assertEquals(1, tokens.size());
        assertTrue(tokens.get(0).getType() == StringToken.class);
    }

}