package com.ezylang.evalex.parser;

import com.ezylang.evalex.functions.FunctionIfc;

public class GeneratedTestParseStringLiteral {

    private String expressionString = "1 + 2";

    @Test
    public void testParseStringLiteral() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc functionDict = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(3, tokens.size());
        assertEquals(TokenType.STRING_LITERAL, tokens.get(0).getType());
        assertEquals("1", tokens.get(0).getValue());
    }

}