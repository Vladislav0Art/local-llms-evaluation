package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedTokenParserValidOperatorTest {

    @Test
    public void tokenParserValidOperatorTest() {
        OperatorIfc mockOperator = Mockito.mock(OperatorIfc.class);
        Mockito.when(mockOperator.getOperatorName()).thenReturn("+");
        ExpressionConfiguration mockConfiguration = Mockito.mock(ExpressionConfiguration.class);
        Mockito.when(mockConfiguration.getOperatorDictionary()).thenReturn(mockOperator);

        Tokenizer tokenizer = new Tokenizer("2+2", mockConfiguration);
        List<Token> result = tokenizer.parse();
        Assert.assertEquals("+", result.get(1).content);
    }

}