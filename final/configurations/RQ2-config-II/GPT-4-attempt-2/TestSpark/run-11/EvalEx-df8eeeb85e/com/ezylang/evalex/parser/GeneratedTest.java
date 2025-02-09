package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedTest {

    @Test
    public void parseValidExpressionTest() throws ParseException {
        String testExpression = "3+2";
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(testExpression, configuration);
        List<Token> result = tokenizer.parse();
        Assert.assertNotNull(result);
        Assert.assertEquals(3, result.size());
    }

    @Test
    public void parseInvalidExpressionTest() throws ParseException {
        String testExpression = "3++2";
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(testExpression, configuration);
        tokenizer.parse();
    }

    @Test
    public void parseEmptyExpressionTest() throws ParseException {
        String testExpression = "";
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(testExpression, configuration);
        List<Token> result = tokenizer.parse();
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void parseStringLiteralValidTest() throws ParseException {
        String testExpression = "\"hello\"";
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(testExpression, configuration);
        Token result = tokenizer.parseStringLiteral();
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.TokenType.STRINGPARAM, result.getType());
        Assert.assertEquals("hello", result.getSurface());
    }

    @Test
    public void parseStringLiteralInvalidTest() throws ParseException {
        String testExpression = "\"hello";
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(testExpression, configuration);
        tokenizer.parseStringLiteral();
    }

}