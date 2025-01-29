package com.ezylang.evalex.parser;

public class GeneratedTestParseSingleParenthesisToken_Succeeds {

    @Test
    public void testParseSingleParenthesisToken_Succeeds() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();

        // Arrange
        String expression = "(";
        Tokenizer tokenizer = new Tokenizer(expression, configuration);

        // Act and Assert
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());
        assertEquals(TokenType.PARENTHESIS_OPEN, tokens.get(0).getType());
    }

}