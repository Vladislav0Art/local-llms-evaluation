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
        ExpressionConfiguration config = new ExpressionConfiguration(Mockito.mock(FunctionIfc.class), Mockito.mock(OperatorIfc.class));
        Tokenizer tokenizer = new Tokenizer("1+2??", config);
        List<Token> tokens = tokenizer.parse();
    }

}