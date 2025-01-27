package com.ezylang.evalex.parser;

public class GeneratedGivenExpressionStringWithMultipleTokensParseMultipleTokensTest {

    @Test
    public void givenExpressionStringWithMultipleTokensParseMultipleTokensTest() {
        // Arrange
        String expressionString = "hello world";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        configuration.setFunctionDictionaryIfc(new FunctionDictionaryIfc());
        configuration.setOperatorDictionaryIfc(new OperatorDictionaryIfc());

        // Act
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();

        // Assert
        assertEquals(2, tokens.size());
        assertTrue(tokens.get(0).getType() == StringToken.class);
        assertTrue(tokens.get(1).getType() == StringToken.class);
    }

}