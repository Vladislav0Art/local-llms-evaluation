package com.ezylang.evalex.parser;

import org.junit.Before;

import static org.junit.Assert.*;

public class GeneratedTestParseStringLiteral {

    @Before
    public void setup() {
        String expressionString = "1 + 2";
        Tokenizer tokenizer = new Tokenizer(expressionString);
    }

    @Test
    public void testParseStringLiteral() {
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new SingleNumberToken(1));
        expectedTokens.add(new BinaryPlusToken("+", 2));
        assertEquals(expectedTokens, tokenizer.parseStringLiteral());
    }

}