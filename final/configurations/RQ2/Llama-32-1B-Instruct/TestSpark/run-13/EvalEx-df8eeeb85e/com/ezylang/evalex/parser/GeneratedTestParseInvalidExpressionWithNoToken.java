package com.ezylang.evalex.parser;

import com.ezylang.evalex.functions.FunctionIfc;

public class GeneratedTestParseInvalidExpressionWithNoToken {

    private String expressionString = "1 + 2";

    @Test
    public void testParseInvalidExpressionWithNoToken() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc functionDict = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();
        Tokenizer tokenizer = new Tokenizer(expressionString, functionDict, operatorDict);
        List<Token> tokens = tokenizer.parse();
        assertNull(tokens);
    }
}

}