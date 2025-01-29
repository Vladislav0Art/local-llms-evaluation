package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestParseInvalidFunction {

    @Test
    public void testParseInvalidFunction() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        String expression = " invalid function";
        List<Token> result = tokenizer.parse(expression);
        assertEquals(null, result);
    }

}