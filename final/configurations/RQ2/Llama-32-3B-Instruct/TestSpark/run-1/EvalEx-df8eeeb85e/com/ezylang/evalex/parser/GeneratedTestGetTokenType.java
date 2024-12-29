package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetTokenType {

    @Test
    public void testGetTokenType() {
        String expressionString = "1 + 2 * 3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        String token = tokenizer.getTokens()[0];
        assertTrue(token.startsWith("NUMBER"));
        assertTrue(!token.equals("NUMBER"));
    }

}