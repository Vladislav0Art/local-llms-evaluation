package com.ezylang.evalex.parser;

public class GeneratedTestParseMultipleParenthesisTokens {

    @Test
    public void testParseMultipleParenthesisTokens() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();

        String expression = "((";
        Tokenizer tokenizer = new Tokenizer(expression, configuration);

        List<Token> tokens = tokenizer.parseMultipleParenthesisTokens();
        assertEquals(2, tokens.size());
        assertEquals(TokenType.PARENTHESIS_OPEN, tokens.get(0).getType());
        assertEquals(TokenType.ParenthesisOpen, tokens.get(1).getType());
    }

}