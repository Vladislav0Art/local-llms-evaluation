package com.ezylang.evalex.parser;

public class GeneratedGivenExpressionStringWithMultipleOperatorsAndFunctionsParseTokensAndOperatorsAndFunctionsTest {

    @Test
    public void givenExpressionStringWithMultipleOperatorsAndFunctionsParseTokensAndOperatorsAndFunctionsTest() {
        // Arrange
        String expressionString = "sin(x) + cos(y)";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        configuration.setFunctionDictionaryIfc(new FunctionDictionaryIfc());
        configuration.setOperatorDictionaryIfc(new OperatorDictionaryIfc());

        // Act
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();

        // Assert
        assertEquals(5, tokens.size());
        assertTrue(tokens.get(0).getType() == StringToken.class);
        assertTrue(tokens.get(1).getType() == SinFunctionToken.class);
        assertTrue(tokens.get(2).getType() == VariableToken.class);
        assertTrue(tokens.get(3).getType() == PlusOperatorToken.class);
        assertTrue(tokens.get(4).getType() == CosFunctionToken.class);
    }

}