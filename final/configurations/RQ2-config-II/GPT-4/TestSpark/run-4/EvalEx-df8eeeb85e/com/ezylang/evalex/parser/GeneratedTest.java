package com.ezylang.evalex.parser;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;

import java.util.List;

public class GeneratedTest {

    @Test
    public void parseValidExpressionTest() {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("1+2", configuration);

        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(3, tokens.size());
    }

    @Test
    public void parseInvalidExpressionTest() {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("1+*", configuration);

        tokenizer.parse();
    }

    @Test
    public void parseStringLiteralValidTest() {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("\"hello world\"", configuration);

        Token token = tokenizer.parseStringLiteral();
        Assert.assertEquals("\"hello world\"", token.getSurface());
    }

    @Test
    public void parseStringLiteralInvalidTest() {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("\"hello world", configuration);

        tokenizer.parseStringLiteral();
    }

    @Test
    public void parseFunctionExpressionTest() {
        FunctionIfc function = Mockito.mock(FunctionIfc.class);
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        when(configuration.getFunction("FUN")).thenReturn(function);
        Tokenizer tokenizer = new Tokenizer("FUN(1,2)", configuration);

        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(5, tokens.size());
    }

    @Test
    public void parseOperatorExpressionTest() {
        OperatorIfc operator = Mockito.mock(OperatorIfc.class);
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        when(configuration.getOperator("+")).thenReturn(operator);
        Tokenizer tokenizer = new Tokenizer("1+2", configuration);

        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(3, tokens.size());
    }

}