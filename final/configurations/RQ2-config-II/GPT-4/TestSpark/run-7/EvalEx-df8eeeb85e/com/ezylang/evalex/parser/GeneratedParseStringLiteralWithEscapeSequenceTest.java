package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

public class GeneratedParseStringLiteralWithEscapeSequenceTest {

    @Test
    public void parseStringLiteralWithEscapeSequenceTest() throws ParseException {
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("\"Test \\\"String\\\"\"", config);
        Token token = tokenizer.parseStringLiteral();
        assertNotNull(token);
    }

}