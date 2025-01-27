package com.ezylang.evalex.parser;

public class GeneratedGivenExpressionStringWithMultipleFunctionsParseTokensAndFunctionsTest {

    @Test
    public void givenExpressionStringWithMultipleFunctionsParseTokensAndFunctionsTest() {
        // Arrange
        String expressionString = "sin(x)";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        configuration.setFunctionDictionaryIfc(new FunctionDictionaryIfc());

        // Act
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();

        // Assert
        assertEquals(3, tokens.size());
        assertTrue(tokens.get(0).getType() == StringToken.class);
        assertTrue(tokens.get(1).getType() == SinFunctionToken.class);
        assertTrue(tokens.get(2).getType() == VariableToken.class);
    }

}