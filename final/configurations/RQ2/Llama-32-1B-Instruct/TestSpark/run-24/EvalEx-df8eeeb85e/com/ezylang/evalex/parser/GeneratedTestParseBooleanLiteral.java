package com.ezylang.evalex.parser;

import org.junit.Before;

import static org.junit.Assert.*;

public class GeneratedTestParseBooleanLiteral {

    @Before
    public void setup() {
        String expressionString = "1 + 2";
        Tokenizer tokenizer = new Tokenizer(expressionString);
    }

    @Test
    public void testParseBooleanLiteral() {
        String expressionString = "true";
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new BooleanNumberToken(true));
        assertEquals(expectedTokens, tokenizer.parseBooleanLiteral(expressionString));
    }

}