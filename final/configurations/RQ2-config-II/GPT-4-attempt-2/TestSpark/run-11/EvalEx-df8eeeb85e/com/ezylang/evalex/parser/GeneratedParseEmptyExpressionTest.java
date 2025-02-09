package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseEmptyExpressionTest {

    @Test
    public void parseEmptyExpressionTest() throws ParseException {
        String testExpression = "";
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(testExpression, configuration);
        List<Token> result = tokenizer.parse();
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

}