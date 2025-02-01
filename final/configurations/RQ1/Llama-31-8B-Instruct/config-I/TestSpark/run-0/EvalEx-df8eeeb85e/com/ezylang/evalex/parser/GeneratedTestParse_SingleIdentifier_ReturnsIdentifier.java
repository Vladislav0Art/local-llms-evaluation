package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestParse_SingleIdentifier_ReturnsIdentifier {

    @Test
    public void testParse_SingleIdentifier_ReturnsIdentifier() throws ParseException {
        ExpressionConfiguration configuration = mock(ExpressionConfiguration.class);
        when(configuration.isImplicitMultiplicationAllowed()).thenReturn(true);
        when(configuration.isArraysAllowed()).thenReturn(true);
        when(configuration.isStructuresAllowed()).thenReturn(true);
        Tokenizer tokenizer = new Tokenizer("x", configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());
        assertEquals(TokenType.VARIABLE_OR_CONSTANT, tokens.get(0).getType());
        assertEquals("x", tokens.get(0).getValue());
    }

}