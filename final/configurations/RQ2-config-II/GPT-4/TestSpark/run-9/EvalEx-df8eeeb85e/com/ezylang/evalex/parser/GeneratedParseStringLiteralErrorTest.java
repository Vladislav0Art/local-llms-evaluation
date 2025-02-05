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
public class GeneratedParseStringLiteralErrorTest {

    @Mock
    private ExpressionConfiguration mockExpressionConfiguration;

    @Mock
    private FunctionIfc mockFunction;

    @Mock
    private OperatorIfc mockOperator;

    @Test
    public void parseStringLiteralErrorTest() throws ParseException {
        String testExpression = "\"Hello";

        Tokenizer tokenizer = new Tokenizer(testExpression, mockExpressionConfiguration);
        tokenizer.parseStringLiteral();
    }

}