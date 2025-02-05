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
    public void tokenizerConstructorValidInputTest() {
        ExpressionConfiguration config = new ExpressionConfiguration(Mockito.mock(FunctionIfc.class), Mockito.mock(OperatorIfc.class));
        new Tokenizer("1+2", config);

        Assert.assertTrue(true);
    }

    @Test
    public void tokenizerConstructorNullExpressionStringTest() {
        ExpressionConfiguration config = new ExpressionConfiguration(Mockito.mock(FunctionIfc.class), Mockito.mock(OperatorIfc.class));
        new Tokenizer(null, config);
    }

    @Test
    public void tokenizerConstructorNullConfigTest() {
        new Tokenizer("1+2", null);
    }

    @Test
    public void parseValidExpressionTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration(Mockito.mock(FunctionIfc.class), Mockito.mock(OperatorIfc.class));
        Tokenizer tokenizer = new Tokenizer("1+2", config);
        List<Token> tokens = tokenizer.parse();

        Assert.assertEquals(3, tokens.size());
    }

    @Test
    public void parseInvalidExpressionTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration(Mockito.mock(FunctionIfc.class), Mockito.mock(OperatorIfc.class));
        Tokenizer tokenizer = new Tokenizer("1+2??", config);
        List<Token> tokens = tokenizer.parse();
    }

    @Test
    public void parseStringLiteralValidInputTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration(Mockito.mock(FunctionIfc.class), Mockito.mock(OperatorIfc.class));
        Tokenizer tokenizer = new Tokenizer("\"Hello, world!\"", config);

        Token token = tokenizer.parseStringLiteral();

        Assert.assertEquals("Hello, world!", token.surface);
    }

    @Test
    public void parseStringLiteralInvalidInputTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration(Mockito.mock(FunctionIfc.class), Mockito.mock(OperatorIfc.class));
        Tokenizer tokenizer = new Tokenizer("Hello, world!", config);

        tokenizer.parseStringLiteral();
    }

}