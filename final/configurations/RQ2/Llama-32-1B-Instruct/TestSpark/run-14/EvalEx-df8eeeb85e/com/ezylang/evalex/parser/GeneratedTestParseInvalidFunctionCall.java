package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestParseInvalidFunctionCall {

    @Test
    public void testParseInvalidFunctionCall() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        String expression = " 1 / 0";
        List<Token> result = tokenizer.parse(expression);
        assertEquals(null, result);
    }

}