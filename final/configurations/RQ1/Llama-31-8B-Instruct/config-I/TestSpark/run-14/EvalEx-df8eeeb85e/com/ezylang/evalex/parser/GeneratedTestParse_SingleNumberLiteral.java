package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestParse_SingleNumberLiteral {

    @Test
    public void testParse_SingleNumberLiteral() {
        ExpressionConfiguration configuration = mock(ExpressionConfiguration.class);
        when(configuration.isImplicitMultiplicationAllowed()).thenReturn(true);
        when(configuration.isArraysAllowed()).thenReturn(true);
        when(configuration.isStructuresAllowed()).thenReturn(true);
        Tokenizer tokenizer = new Tokenizer("123", configuration);
        try {
            List<Token> tokens = tokenizer.parse();
            assertEquals(1, tokens.size());
            assertEquals(TokenType.NUMBER_LITERAL, tokens.get(0).getType());
            assertEquals("123", tokens.get(0).getValue());
        } catch (ParseException e) {
            fail();
        }
    }

}