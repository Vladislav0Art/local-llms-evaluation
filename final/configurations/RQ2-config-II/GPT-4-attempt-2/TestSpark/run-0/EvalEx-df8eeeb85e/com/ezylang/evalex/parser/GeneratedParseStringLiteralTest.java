package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeneratedParseStringLiteralTest {

    @Test
    public void parseStringLiteralTest() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("\"Test\"", new ExpressionConfiguration());
        Assert.assertEquals(Collections.singletonList(new Token("Test")), tokenizer.parse());
    }

}