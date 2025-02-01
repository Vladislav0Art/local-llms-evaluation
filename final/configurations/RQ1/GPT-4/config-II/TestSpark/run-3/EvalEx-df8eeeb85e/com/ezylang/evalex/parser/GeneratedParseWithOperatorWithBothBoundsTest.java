package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedParseWithOperatorWithBothBoundsTest {

    @Test
    public void parseWithOperatorWithBothBoundsTest() {
        OperatorIfc operator = mock(OperatorIfc.class);
        when(operator.getPrecedence()).thenReturn(1);
        when(operator.isLeftAssociative()).thenReturn(false);

        ExpressionConfiguration configuration = new ExpressionConfiguration();
        configuration.addOperator("+", operator, true, true, false);

        Tokenizer tokenizer = new Tokenizer("5+3", configuration);
        try {
            tokenizer.parse();
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
        }
    }

}