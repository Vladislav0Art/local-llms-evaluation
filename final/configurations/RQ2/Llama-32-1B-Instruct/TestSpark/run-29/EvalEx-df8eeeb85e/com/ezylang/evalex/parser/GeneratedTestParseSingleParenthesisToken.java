package com.ezylang.evalex.parser;

public class GeneratedTestParseSingleParenthesisToken {

    @Test
    public void testParseSingleParenthesisToken() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();

        String expression = "()";
        Tokenizer tokenizer = new Tokenizer(expression, configuration);

        List<Token> tokens = tokenizer.parseSingleParenthesisToken();
        assertEquals(1, tokens.size());
        assertEquals(TokenType.PARENTHESIS_OPEN, tokens.get(0).getType());
    }

}