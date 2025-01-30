package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseWithImplicitMultiplicationNotAllowedThrowExceptionTest {

    @Test
    public void parseWithImplicitMultiplicationNotAllowedThrowExceptionTest() throws ParseException {
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        Mockito.when(mockConfig.isImplicitMultiplicationAllowed()).thenReturn(false);

        FunctionDictionaryIfc mockFunctionDictionary = Mockito.mock(FunctionDictionaryIfc.class);
        Mockito.when(mockConfig.getFunctionDictionary()).thenReturn(mockFunctionDictionary);

        OperatorDictionaryIfc mockOperatorDictionary = Mockito.mock(OperatorDictionaryIfc.class);
        Mockito.when(mockConfig.getOperatorDictionary()).thenReturn(mockOperatorDictionary);

        Tokenizer tokenizer = new Tokenizer("(1)(1)", mockConfig);
        tokenizer.parse();
    }

}