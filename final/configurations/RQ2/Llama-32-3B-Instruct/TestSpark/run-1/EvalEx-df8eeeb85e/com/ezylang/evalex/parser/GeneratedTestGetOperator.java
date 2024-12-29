package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetOperator {

    @Test
    public void testGetOperator() {
        String expressionString = "1 + 2 * 3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        String operator = tokenizer.getOperators()[0];
        assertTrue(operator.equals("+"));
    }

}