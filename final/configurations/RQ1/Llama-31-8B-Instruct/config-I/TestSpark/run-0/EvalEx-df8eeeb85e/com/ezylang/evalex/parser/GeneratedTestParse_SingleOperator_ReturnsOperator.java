package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestParse_SingleOperator_ReturnsOperator {

    @Test
    public void testParse_SingleOperator_ReturnsOperator() throws ParseException {
        ExpressionConfiguration configuration = mock(ExpressionConfiguration.class);
        when(configuration.isImplicitMultiplicationAllowed()).thenReturn(true);
        when(configuration.isArraysAllowed()).thenReturn(true);
        when(configuration.isStructuresAllowed()).thenReturn(true);
        Tokenizer tokenizer = new Tokenizer("+", configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());
        assertEquals(TokenType.INFIX_OPERATOR, tokens.get(0).getType());
        assertEquals("+", tokens.get(0).getValue());
    }

}