package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void testParse_EmptyString_ReturnsEmptyList() throws ParseException {
        ExpressionConfiguration configuration = mock(ExpressionConfiguration.class);
        when(configuration.isImplicitMultiplicationAllowed()).thenReturn(true);
        when(configuration.isArraysAllowed()).thenReturn(true);
        when(configuration.isStructuresAllowed()).thenReturn(true);
        Tokenizer tokenizer = new Tokenizer("", configuration);
        List<Token> tokens = tokenizer.parse();
        assertTrue(tokens.isEmpty());
    }

}