package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestParse_SingleIdentifier {

    @Test
    public void testParse_SingleIdentifier() {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        when(config.getOperatorDictionary()).thenReturn(mock(OperatorDictionaryIfc.class));
        when(config.getFunctionDictionary()).thenReturn(mock(FunctionDictionaryIfc.class));
        when(config.isImplicitMultiplicationAllowed()).thenReturn(true);
        when(config.isArraysAllowed()).thenReturn(true);
        when(config.isStructuresAllowed()).thenReturn(true);
        Tokenizer tokenizer = new Tokenizer("abc", config);
        try {
            List<Token> tokens = tokenizer.parse();
            assertEquals(1, tokens.size());
            assertEquals(TokenType.VARIABLE_OR_CONSTANT, tokens.get(0).getType());
            assertEquals("abc", tokens.get(0).getValue());
        } catch (ParseException e) {
            fail();
        }
    }

}