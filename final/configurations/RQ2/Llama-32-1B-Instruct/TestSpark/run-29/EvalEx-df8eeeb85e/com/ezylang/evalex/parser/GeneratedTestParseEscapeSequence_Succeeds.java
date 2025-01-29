package com.ezylang.evalex.parser;

public class GeneratedTestParseEscapeSequence_Succeeds {

    @Test
    public void testParseEscapeSequence_Succeeds() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();

        // Arrange
        String expression = "a\\b";
        Tokenizer tokenizer = new Tokenizer(expression, configuration);

        // Act and Assert
        List<Token> tokens = tokenizer.parse();
        assertEquals(2, tokens.size());
        assertEquals(TokenType.SEPARATOR, tokens.get(0).getType());
        assertEquals(TokenType.CHARACTER, tokens.get(1).getType());
    }

}