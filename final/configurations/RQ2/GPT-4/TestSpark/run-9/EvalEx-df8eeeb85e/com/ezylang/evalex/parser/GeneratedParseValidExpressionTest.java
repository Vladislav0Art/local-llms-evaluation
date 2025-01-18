package com.ezylang.evalex.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseValidExpressionTest {

    @Mock
    private ExpressionConfiguration configuration;

    @Mock
    private FunctionDictionaryIfc functionDictionary;

    @Mock
    private OperatorDictionaryIfc operatorDictionary;

    @InjectMocks
    private Tokenizer tokenizer;

    @Test
    public void parseValidExpressionTest() throws ParseException {
        when(configuration.getFunctionDictionary()).thenReturn(functionDictionary);
        when(configuration.getOperatorDictionary()).thenReturn(operatorDictionary);

        List<Token> tokens = tokenizer.parse("1+1");

        assertFalse(tokens.isEmpty());
    }

}