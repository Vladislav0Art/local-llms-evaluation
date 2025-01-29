package com.ezylang.evalex.parser;

public class GeneratedTestParseStringLiteral_SingleWordToken {

    @Test
    public void testParseStringLiteral_SingleWordToken() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();

        String expression = "test";
        Tokenizer tokenizer = new Tokenizer(expression, configuration);

        List<Token> tokens = tokenizer.parseStringLiteral();
        assertEquals(1, tokens.size());
        assertEquals(TokenType.WORD, tokens.get(0).getType());
    }

}