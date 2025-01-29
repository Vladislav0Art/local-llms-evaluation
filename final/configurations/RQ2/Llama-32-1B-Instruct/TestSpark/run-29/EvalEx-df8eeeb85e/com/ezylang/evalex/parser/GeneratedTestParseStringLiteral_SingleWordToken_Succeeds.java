package com.ezylang.evalex.parser;

public class GeneratedTestParseStringLiteral_SingleWordToken_Succeeds {

    @Test
    public void testParseStringLiteral_SingleWordToken_Succeeds() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();

        // Arrange
        String expression = "test";
        Tokenizer tokenizer = new Tokenizer(expression, configuration);

        // Act and Assert
        List<Token> tokens = tokenizer.parseStringLiteral();
        assertEquals(1, tokens.size());
        assertEquals(TokenType.WORD, tokens.get(0).getType());
    }

}