package com.ezylang.evalex.parser;

public class GeneratedGivenExpressionStringWithVariableParseVariableTest {

    @Test
    public void givenExpressionStringWithVariableParseVariableTest() {
        // Arrange
        String expressionString = "x";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        configuration.setFunctionDictionaryIfc(new FunctionDictionaryIfc());
        configuration.setOperatorDictionaryIfc(new OperatorDictionaryIfc());

        // Act
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();

        // Assert
        assertEquals(1, tokens.size());
        assertTrue(tokens.get(0).getType() == VariableToken.class);
    }

}