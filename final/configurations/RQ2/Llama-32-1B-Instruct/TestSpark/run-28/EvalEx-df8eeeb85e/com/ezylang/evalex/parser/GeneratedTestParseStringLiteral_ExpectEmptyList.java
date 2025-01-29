package com.ezylang.evalex.parser;

public class GeneratedTestParseStringLiteral_ExpectEmptyList {

    @Test
    public void testParseStringLiteral_ExpectEmptyList() throws ParseException {
        String expressionString = "x";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc("x");
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();

        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();

        assertEquals(0, tokens.size());
    }

}