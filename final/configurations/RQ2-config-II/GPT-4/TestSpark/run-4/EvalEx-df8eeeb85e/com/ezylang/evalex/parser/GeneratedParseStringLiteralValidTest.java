package com.ezylang.evalex.parser;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;

import java.util.List;

public class GeneratedParseStringLiteralValidTest {

    @Test
    public void parseStringLiteralValidTest() {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("\"hello world\"", configuration);

        Token token = tokenizer.parseStringLiteral();
        Assert.assertEquals("\"hello world\"", token.getSurface());
    }

}