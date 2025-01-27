package com.ezylang.evalex.parser;

public class GeneratedGivenExpressionStringWithMultipleOperatorsParseTokensAndOperatorsTest {

    @Test
    public void givenExpressionStringWithMultipleOperatorsParseTokensAndOperatorsTest() {
        // Arrange
        String expressionString = "hello + world";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        configuration.setFunctionDictionaryIfc(new FunctionDictionaryIfc());
        configuration.setOperatorDictionaryIfc(new OperatorDictionaryIfc());

        // Act
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();

        // Assert
        assertEquals(3, tokens.size());
        assertTrue(tokens.get(0).getType() == StringToken.class);
        assertTrue(tokens.get(1).getType() == PlusOperatorToken.class);
        assertTrue(tokens.get(2).getType() == StringToken.class);
    }

}