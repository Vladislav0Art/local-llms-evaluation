package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestParseInvalidToken {

    @Test
    public void testParseInvalidToken() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        String expression = " invalid";
        List<Token> result = tokenizer.parse(expression);
        assertEquals(null, result);
    }

}