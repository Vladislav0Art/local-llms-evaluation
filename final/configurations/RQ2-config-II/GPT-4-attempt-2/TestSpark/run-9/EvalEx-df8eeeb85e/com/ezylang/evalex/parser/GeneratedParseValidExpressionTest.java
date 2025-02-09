package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

public class GeneratedParseValidExpressionTest {

    @Test
    public void parseValidExpressionTest() throws ParseException {
        ExpressionConfiguration configuration = mock(ExpressionConfiguration.class);
        when(configuration.getOperatorDictionary()).thenReturn(mock(OperatorDictionaryIfc.class));
        when(configuration.getFunctionDictionary()).thenReturn(mock(FunctionDictionaryIfc.class));
        new Tokenizer("3+5", configuration).parse();
        verify(configuration, times(1)).getOperatorDictionary();
        verify(configuration, times(1)).getFunctionDictionary();
    }

}