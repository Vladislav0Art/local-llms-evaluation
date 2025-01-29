package com.ezylang.evalex.parser;

import com.ezylang.evalex.functions.FunctionIfc;

public class GeneratedTestParseInvalidExpression {

    private String expressionString = "1 + 2";

    @Test
    public void testParseInvalidExpression() {
        FunctionDictionaryIfc functionDict = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();
        Tokenizer tokenizer = new Tokenizer(expressionString, functionDict, operatorDict);
        List<Token> tokens = tokenizer.parse();
        assertNotNull(tokens);
    }

}