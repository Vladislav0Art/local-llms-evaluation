package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetTokenValue {

    @Test
    public void testGetTokenValue() {
        String expressionString = "1 + 2 * 3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        String token = tokenizer.getTokens()[0];
        assertTrue(token.equals("NUMBER"));
        assertTrue(Double.parseDouble(token));
    }

}