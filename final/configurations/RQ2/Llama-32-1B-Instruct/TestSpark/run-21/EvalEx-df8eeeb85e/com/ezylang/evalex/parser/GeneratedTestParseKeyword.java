package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestParseKeyword {

    @Test
    public void testParseKeyword() throws ParseException {
        String expressionString = "true";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());
        assertTrue(tokens.get(0) instanceof KeywordToken);
    }

}