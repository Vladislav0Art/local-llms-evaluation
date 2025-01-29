package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestParseSimpleExpression {

    @Test
    public void testParseSimpleExpression() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        String expression = "1 + 2";
        List<Token> result = tokenizer.parse(expression);
        assertEquals(4, result.size());
        assertEquals("1", result.get(0).getType());
        assertEquals("+", result.get(1).getType());
        assertEquals("2", result.get(2).getType());
    }

}