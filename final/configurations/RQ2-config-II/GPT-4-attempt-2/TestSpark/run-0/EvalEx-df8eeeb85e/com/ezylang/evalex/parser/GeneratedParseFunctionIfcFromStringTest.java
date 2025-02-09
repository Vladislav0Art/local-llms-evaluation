package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeneratedParseFunctionIfcFromStringTest {

    @Test
    public void parseFunctionIfcFromStringTest() throws ParseException {
        FunctionIfc functionIfc = Mockito.mock(FunctionIfc.class);
        Mockito.when(functionIfc.apply(Mockito.any())).thenReturn(2.0);
        Tokenizer tokenizer = new Tokenizer("2 + 2", functionIfc);
        Assert.assertEquals(Arrays.asList(new Token(2), new Token("+"), new Token(2)), tokenizer.parse());
    }

}