package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestParseMultipleOperators {

    @Test
    public void testParseMultipleOperators() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        String expression = " 1 + 2 - 3";
        List<Token> result = tokenizer.parse(expression);
        assertEquals(4, result.size());
        assertEquals("+", result.get(0).getType());
        assertEquals("2", result.get(1).getType());
        assertEquals("-", result.get(2).getType());
        assertEquals("3", result.get(3).getType());
    }

}