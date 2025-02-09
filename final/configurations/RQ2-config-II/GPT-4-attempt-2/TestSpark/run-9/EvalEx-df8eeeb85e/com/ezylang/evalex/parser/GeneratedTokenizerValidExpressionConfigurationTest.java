package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

public class GeneratedTokenizerValidExpressionConfigurationTest {

    @Test
    public void tokenizerValidExpressionConfigurationTest() {
        ExpressionConfiguration configuration = mock(ExpressionConfiguration.class);
        new Tokenizer("3+5", configuration);
        verify(configuration, times(1)).toString();
    }

}