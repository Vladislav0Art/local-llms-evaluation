package com.ezylang.evalex.parser;

import org.junit.Before;

import static org.junit.Assert.*;

public class GeneratedTestParseIntegerLiteral {

    @Before
    public void setup() {
        String expressionString = "1 + 2";
        Tokenizer tokenizer = new Tokenizer(expressionString);
    }

    @Test
    public void testParseIntegerLiteral() {
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new IntegerNumberToken(123));
        assertEquals(expectedTokens, tokenizer.parseIntegerLiteral(expressionString));
    }

}