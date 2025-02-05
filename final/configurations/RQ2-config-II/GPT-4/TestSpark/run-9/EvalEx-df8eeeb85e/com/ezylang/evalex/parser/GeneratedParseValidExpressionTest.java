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
public class GeneratedParseValidExpressionTest {

    @Mock
    private ExpressionConfiguration mockExpressionConfiguration;

    @Mock
    private FunctionIfc mockFunction;

    @Mock
    private OperatorIfc mockOperator;

    @Test
    public void parseValidExpressionTest() throws ParseException {
        String testExpression = "2+2";
        when(mockExpressionConfiguration.getFunction("2")).thenReturn(mockFunction);
        when(mockExpressionConfiguration.getOperator("+")).thenReturn(mockOperator);

        Tokenizer tokenizer = new Tokenizer(testExpression, mockExpressionConfiguration);
        List<Token> result = tokenizer.parse();

        assertFalse(result.isEmpty());
    }

}