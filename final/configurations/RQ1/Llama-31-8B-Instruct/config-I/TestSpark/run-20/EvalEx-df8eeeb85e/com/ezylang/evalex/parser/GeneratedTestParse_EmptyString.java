package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;

public class GeneratedTestParse_EmptyString {

    @Test
    public void testParse_EmptyString() {
        ExpressionConfiguration configuration = mock(ExpressionConfiguration.class);
        OperatorDictionaryIfc operatorDictionary = mock(OperatorDictionaryIfc.class);
        FunctionDictionaryIfc functionDictionary = mock(FunctionDictionaryIfc.class);
        when(configuration.getOperatorDictionary()).thenReturn(operatorDictionary);
        when(configuration.getFunctionDictionary()).thenReturn(functionDictionary);
        when(configuration.isImplicitMultiplicationAllowed()).thenReturn(true);
        when(configuration.isArraysAllowed()).thenReturn(true);
        when(configuration.isStructuresAllowed()).thenReturn(true);
        Tokenizer tokenizer = new Tokenizer("", configuration);
        try {
            List<Token> tokens = new ArrayList<>();
            tokens = tokenizer.parse();
            assertTrue(tokens.isEmpty());
        } catch (com.ezylang.evalex.parser.ParseException e) {
            fail();
        }
    }

}