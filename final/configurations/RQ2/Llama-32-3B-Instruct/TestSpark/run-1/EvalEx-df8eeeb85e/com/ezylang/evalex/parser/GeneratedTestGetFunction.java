package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetFunction {

    @Test
    public void testGetFunction() {
        String expressionString = "1 + 2 * 3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        String function = tokenizer.getFunctions()[0];
        assertTrue(function.equals("NUMBER"));
    }

}