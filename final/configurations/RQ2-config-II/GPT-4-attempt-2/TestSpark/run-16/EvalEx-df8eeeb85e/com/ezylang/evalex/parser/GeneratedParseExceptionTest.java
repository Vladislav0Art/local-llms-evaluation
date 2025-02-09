package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.*;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseExceptionTest {

    @Test
    public void parseExceptionTest() throws ParseException {
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("1+*", config);
        tokenizer.parse();
    }

}