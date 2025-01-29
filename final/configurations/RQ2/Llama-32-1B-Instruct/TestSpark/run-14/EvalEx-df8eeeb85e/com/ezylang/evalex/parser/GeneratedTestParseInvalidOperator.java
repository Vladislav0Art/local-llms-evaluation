package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestParseInvalidOperator {

    @Test
    public void testParseInvalidOperator() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        String expression = "1 + 2 - ";
        List<Token> result = tokenizer.parse(expression);
        assertEquals(null, result);
    }

}