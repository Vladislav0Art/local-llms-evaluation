package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.*;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseStringLiteralTest {

    @Test
    public void parseStringLiteralTest() throws ParseException {
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("\"Hello, World!\"", config);
        Token result = tokenizer.parseStringLiteral();
        assert result != null;
    }

}