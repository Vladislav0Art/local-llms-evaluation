package com.ezylang.evalex.parser;

public class GeneratedTestParseCharacterToken_Succeeds {

    @Test
    public void testParseCharacterToken_Succeeds() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();

        // Arrange
        String expression = "a";
        Tokenizer tokenizer = new Tokenizer(expression, configuration);

        // Act and Assert
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());
        assertEquals(TokenType.CHARACTER, tokens.get(0).getType());
    }

}