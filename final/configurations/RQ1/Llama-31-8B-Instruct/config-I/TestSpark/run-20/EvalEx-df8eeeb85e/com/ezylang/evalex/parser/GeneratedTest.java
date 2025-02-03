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

public class GeneratedTest {

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

    @Test
    public void testParse_SingleNumberLiteral() {
        ExpressionConfiguration configuration = mock(ExpressionConfiguration.class);
        OperatorDictionaryIfc operatorDictionary = mock(OperatorDictionaryIfc.class);
        FunctionDictionaryIfc functionDictionary = mock(FunctionDictionaryIfc.class);
        when(configuration.getOperatorDictionary()).thenReturn(operatorDictionary);
        when(configuration.getFunctionDictionary()).thenReturn(functionDictionary);
        when(configuration.isImplicitMultiplicationAllowed()).thenReturn(true);
        when(configuration.isArraysAllowed()).thenReturn(true);
        when(configuration.isStructuresAllowed()).thenReturn(true);
        Tokenizer tokenizer = new Tokenizer("123", configuration);
        try {
            List<Token> tokens = new ArrayList<>();
            tokens = tokenizer.parse();
            assertEquals(1, tokens.size());
            assertEquals(Token.TokenType.NUMBER_LITERAL, tokens.get(0).getType());
            assertEquals("123", tokens.get(0).getValue());
        } catch (com.ezylang.evalex.parser.ParseException e) {
            fail();
        }
    }

}