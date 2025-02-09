package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseInvalidExpressionTest {

    @Test
    public void parseInvalidExpressionTest() throws ParseException {
        String testExpression = "3++2";
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(testExpression, configuration);
        tokenizer.parse();
    }

}