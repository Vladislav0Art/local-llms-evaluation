package com.ezylang.evalex.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParse_EmptyString_ReturnsEmptyList {

    @InjectMocks
    private Tokenizer tokenizer;

    @Mock
    private ExpressionConfiguration configuration;

    @Test
    public void parse_EmptyString_ReturnsEmptyList() throws ParseException {
        when(configuration.isImplicitMultiplicationAllowed()).thenReturn(true);
        when(configuration.isArraysAllowed()).thenReturn(true);
        when(configuration.isStructuresAllowed()).thenReturn(true);
        List<Token> result = tokenizer.parse();
        assertEquals(0, result.size());
    }

}