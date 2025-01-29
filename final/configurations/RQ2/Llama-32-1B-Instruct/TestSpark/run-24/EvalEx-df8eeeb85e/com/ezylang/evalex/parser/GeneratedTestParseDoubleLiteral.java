package com.ezylang.evalex.parser;

import org.junit.Before;

import static org.junit.Assert.*;

public class GeneratedTestParseDoubleLiteral {

    @Before
    public void setup() {
        String expressionString = "1 + 2";
        Tokenizer tokenizer = new Tokenizer(expressionString);
    }

    @Test
    public void testParseDoubleLiteral() {
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new DoubleNumberToken(12.3));
        assertEquals(expectedTokens, tokenizer.parseDoubleLiteral(expressionString));
    }

}