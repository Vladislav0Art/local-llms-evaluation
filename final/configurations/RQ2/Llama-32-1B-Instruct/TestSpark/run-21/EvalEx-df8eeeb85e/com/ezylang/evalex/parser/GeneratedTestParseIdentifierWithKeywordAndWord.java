package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestParseIdentifierWithKeywordAndWord {

    @Test
    public void testParseIdentifierWithKeywordAndWord() throws ParseException {
        String expressionString = "true abc";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(2, tokens.size());
        assertTrue(tokens.get(0) instanceof KeywordToken);
        assertTrue(tokens.get(1) instanceof WordToken);
    }

}