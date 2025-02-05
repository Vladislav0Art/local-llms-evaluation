package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseInvalidExpressionTest {

    @Mock
    private ExpressionConfiguration mockExpressionConfiguration;

    @Mock
    private FunctionIfc mockFunction;

    @Mock
    private OperatorIfc mockOperator;

    @Test
    public void parseInvalidExpressionTest() throws ParseException {
        String testExpression = "2++2";

        Tokenizer tokenizer = new Tokenizer(testExpression, mockExpressionConfiguration);
        tokenizer.parse();
    }

}