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
public class GeneratedParse_SingleNumberLiteral_ReturnsNumberLiteral {

    @InjectMocks
    private Tokenizer tokenizer;

    @Mock
    private ExpressionConfiguration configuration;

    @Test
    public void parse_SingleNumberLiteral_ReturnsNumberLiteral() throws ParseException {
        when(configuration.isImplicitMultiplicationAllowed()).thenReturn(true);
        when(configuration.isArraysAllowed()).thenReturn(true);
        when(configuration.isStructuresAllowed()).thenReturn(true);
        String expression = "5";
        when(configuration.getExpressionString()).thenReturn(expression);
        List<Token> result = tokenizer.parse();
        assertEquals(1, result.size());
        assertEquals(TokenType.NUMBER_LITERAL, result.get(0).getType());
    }

}