package com.ezylang.evalex.parser;

public class GeneratedTestParseDigitToken_Succeeds {

    @Test
    public void testParseDigitToken_Succeeds() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();

        // Arrange
        String expression = "1";
        Tokenizer tokenizer = new Tokenizer(expression, configuration);

        // Act and Assert
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());
        assertEquals(TokenType.DIGIT, tokens.get(0).getType());
    }

}