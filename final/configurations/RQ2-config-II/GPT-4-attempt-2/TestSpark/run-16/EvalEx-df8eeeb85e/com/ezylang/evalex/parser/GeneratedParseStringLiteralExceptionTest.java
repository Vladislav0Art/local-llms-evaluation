package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.*;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseStringLiteralExceptionTest {

    @Test
    public void parseStringLiteralExceptionTest() throws ParseException {
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("\"Hello, World!", config);
        tokenizer.parseStringLiteral();
    }

}