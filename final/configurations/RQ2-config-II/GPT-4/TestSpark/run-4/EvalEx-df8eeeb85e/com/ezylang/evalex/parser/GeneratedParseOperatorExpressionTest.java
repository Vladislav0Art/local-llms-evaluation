package com.ezylang.evalex.parser;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;

import java.util.List;

public class GeneratedParseOperatorExpressionTest {

    @Test
    public void parseOperatorExpressionTest() {
        OperatorIfc operator = Mockito.mock(OperatorIfc.class);
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        when(configuration.getOperator("+")).thenReturn(operator);
        Tokenizer tokenizer = new Tokenizer("1+2", configuration);

        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(3, tokens.size());
    }

}