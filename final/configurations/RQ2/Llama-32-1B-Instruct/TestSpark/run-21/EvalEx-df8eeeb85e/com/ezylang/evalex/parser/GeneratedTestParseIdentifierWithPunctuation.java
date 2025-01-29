package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestParseIdentifierWithPunctuation {

    @Test
    public void testParseIdentifierWithPunctuation() throws ParseException {
        String expressionString = "test.abc";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(2, tokens.size());
        assertTrue(tokens.get(0) instanceof IdentifierToken);
        assertTrue(tokens.get(1) instanceof PunctuationToken);
    }

}