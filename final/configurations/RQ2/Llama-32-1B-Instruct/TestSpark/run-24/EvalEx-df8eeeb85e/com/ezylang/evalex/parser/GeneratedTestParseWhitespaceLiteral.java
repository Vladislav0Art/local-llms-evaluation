package com.ezylang.evalex.parser;

import org.junit.Before;

import static org.junit.Assert.*;

public class GeneratedTestParseWhitespaceLiteral {

    @Before
    public void setup() {
        String expressionString = "1 + 2";
        Tokenizer tokenizer = new Tokenizer(expressionString);
    }

    @Test
    public void testParseWhitespaceLiteral() {
        String expressionString = "   ";
        List<Token> tokens = tokenizer.parseWhitespaceLiteral(expressionString);
        assertNotNull(tokens);
        assertEquals(1, tokens.size());
        assertTrue(tokens.get(0) instanceof WhitespaceToken);
    }

}