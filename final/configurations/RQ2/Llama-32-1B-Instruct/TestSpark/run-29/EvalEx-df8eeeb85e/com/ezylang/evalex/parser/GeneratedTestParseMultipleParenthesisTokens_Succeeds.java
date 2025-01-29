package com.ezylang.evalex.parser;

public class GeneratedTestParseMultipleParenthesisTokens_Succeeds {

    @Test
    public void testParseMultipleParenthesisTokens_Succeeds() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();

        // Arrange
        String expression = "(()";
        Tokenizer tokenizer = new Tokenizer(expression, configuration);

        // Act and Assert
        List<Token> tokens = tokenizer.parse();
        assertEquals(2, tokens.size());
        assertEquals(TokenType.PARENTHESIS_OPEN, tokens.get(0).getType());
        assertEquals(TokenType.PARENTHESIS_CLOSE, tokens.get(1).getType());
    }

}