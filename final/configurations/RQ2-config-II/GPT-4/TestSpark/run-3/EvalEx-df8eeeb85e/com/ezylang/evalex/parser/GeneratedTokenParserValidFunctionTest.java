package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedTokenParserValidFunctionTest {

    @Test
    public void tokenParserValidFunctionTest() {
        FunctionIfc mockFunction = Mockito.mock(FunctionIfc.class);
        Mockito.when(mockFunction.getFunctionName()).thenReturn("testFunction");
        ExpressionConfiguration mockConfiguration = Mockito.mock(ExpressionConfiguration.class);
        Mockito.when(mockConfiguration.getFunctionDictionary()).thenReturn(mockFunction);

        Tokenizer tokenizer = new Tokenizer("testFunction", mockConfiguration);
        List<Token> result = tokenizer.parse();
        Assert.assertEquals("testFunction", result.get(0).content);
    }

}