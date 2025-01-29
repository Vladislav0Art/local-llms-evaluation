package com.ezylang.evalex.parser;

public class GeneratedTestParseToken_ExpectEmptyListForOperator {

    @Test
    public void testParseToken_ExpectEmptyListForOperator() {
        String expressionString = "x";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        OperatorDictionaryIfc dictionary = new OperatorDictionaryIfc();

        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();

        assertEquals(0, tokens.size());
    }

}