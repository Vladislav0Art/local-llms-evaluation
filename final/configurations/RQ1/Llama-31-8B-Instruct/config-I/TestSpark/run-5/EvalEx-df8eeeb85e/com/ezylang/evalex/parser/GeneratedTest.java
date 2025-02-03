package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void testParse_EmptyString() {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        when(config.getOperatorDictionary()).thenReturn(mock(OperatorDictionaryIfc.class));
        when(config.getFunctionDictionary()).thenReturn(mock(FunctionDictionaryIfc.class));
        when(config.isImplicitMultiplicationAllowed()).thenReturn(true);
        when(config.isArraysAllowed()).thenReturn(true);
        when(config.isStructuresAllowed()).thenReturn(true);
        Tokenizer tokenizer = new Tokenizer("", config);
        try {
            List<Token> tokens = tokenizer.parse();
            assertTrue(tokens.isEmpty());
        } catch (ParseException e) {
            fail();
        }
    }

}