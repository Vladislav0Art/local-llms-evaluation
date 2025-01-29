package com.ezylang.evalex.parser;

public class GeneratedTestParseStringLiteralWithWhitespace {

    @Test
    public void testParseStringLiteralWithWhitespace() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();

        String expression = "\"test\\nstring\"";
        Tokenizer tokenizer = new Tokenizer(expression, configuration);

        List<Token> tokens = tokenizer.parseStringLiteralWithWhitespace();
        assertEquals(2, tokens.size());
        assertEquals(TokenType.WORD, tokens.get(0).getType());
        assertEquals(TokenType.WORD, tokens.get(1).getType());
    }

}