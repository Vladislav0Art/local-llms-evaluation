package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestParseMultipleFunctionCalls {

    @Test
    public void testParseMultipleFunctionCalls() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        String expression = " foo(); bar();";
        List<Token> result = tokenizer.parse(expression);
        assertEquals(4, result.size());
        assertEquals("foo", result.get(0).getType());
        assertEquals("()", result.get(1).getType());
        assertEquals("bar", result.get(2).getType());
    }

}