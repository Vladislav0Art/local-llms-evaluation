package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTokenizerTestUsingMock {

    @Test
    public void tokenizerTestUsingMock() {
        FunctionIfc mockFunction = Mockito.mock(FunctionIfc.class);
        OperatorIfc mockOperator = Mockito.mock(OperatorIfc.class);
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);

        Mockito.when(mockConfig.getFunction(Mockito.anyString())).thenReturn(mockFunction);
        Mockito.when(mockConfig.getOperator(Mockito.anyString())).thenReturn(mockOperator);
        Mockito.when(mockConfig.getDecimalSeparator()).thenReturn('.');
        Mockito.when(mockConfig.getFunctionParameterSeparator()).thenReturn(',');

        Tokenizer tokenizer = new Tokenizer("1+sqrt(4)", mockConfig);

        assertNotNull(tokenizer);
    }

}