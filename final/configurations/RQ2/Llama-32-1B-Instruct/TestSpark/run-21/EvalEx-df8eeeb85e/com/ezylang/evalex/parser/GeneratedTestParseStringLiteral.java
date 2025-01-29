package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestParseStringLiteral {

    @Test
    public void testParseStringLiteral() throws ParseException {
        String expressionString = "5 2 *";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(5, tokens.size());
        assertTrue(tokens.get(0) instanceof NumberToken);
    }

}