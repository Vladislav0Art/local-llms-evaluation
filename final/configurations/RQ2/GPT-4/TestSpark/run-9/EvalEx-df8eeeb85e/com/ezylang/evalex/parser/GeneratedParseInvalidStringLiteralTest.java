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
public class GeneratedParseInvalidStringLiteralTest {

    @Mock
    private ExpressionConfiguration configuration;

    @Mock
    private FunctionDictionaryIfc functionDictionary;

    @Mock
    private OperatorDictionaryIfc operatorDictionary;

    @InjectMocks
    private Tokenizer tokenizer;

    @Test
    public void parseInvalidStringLiteralTest() {
        when(configuration.getStringLiteralCharacter()).thenReturn(null);

        tokenizer.parseStringLiteral();
    }

}