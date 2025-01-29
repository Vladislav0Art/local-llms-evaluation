package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestParseFunctionCallReturn {

    @Test
    public void testParseFunctionCallReturn() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        String expression = " foo() -> 1";
        List<Token> result = tokenizer.parse(expression);
        assertEquals(3, result.size());
        assertEquals("foo", result.get(0).getType());
        assertEquals("(", result.get(1).getType());
        assertEquals("->", result.get(2).getType());
        assertEquals("1", result.get(3).getType());
    }

}