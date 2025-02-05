package com.ezylang.evalex.parser;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;

import java.util.List;

public class GeneratedParseFunctionExpressionTest {

    @Test
    public void parseFunctionExpressionTest() {
        FunctionIfc function = Mockito.mock(FunctionIfc.class);
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        when(configuration.getFunction("FUN")).thenReturn(function);
        Tokenizer tokenizer = new Tokenizer("FUN(1,2)", configuration);

        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(5, tokens.size());
    }

}