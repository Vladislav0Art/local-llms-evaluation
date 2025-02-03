package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestParse_SingleIdentifier {

    @Test
    public void testParse_SingleIdentifier() {
        ExpressionConfiguration configuration = mock(ExpressionConfiguration.class);
        when(configuration.getOperatorDictionary()).thenReturn(mock(OperatorDictionaryIfc.class));
        when(configuration.getFunctionDictionary()).thenReturn(mock(FunctionDictionaryIfc.class));
        when(configuration.isImplicitMultiplicationAllowed()).thenReturn(true);
        when(configuration.isArraysAllowed()).thenReturn(true);
        when(configuration.isStructuresAllowed()).thenReturn(true);
        Tokenizer tokenizer = new Tokenizer("abc", configuration);
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