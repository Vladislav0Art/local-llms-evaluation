package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedTest {

    @Test
    public void TokenizerConstructorAnyParametersTest() {
        String mockString = Mockito.mock(String.class);
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(mockString, mockConfig);
        Assert.assertNotNull(tokenizer);
    }

    @Test
    public void parseEmptyExpressionTest() throws ParseException {
        String mockString = "";
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(mockString, mockConfig);
        List<Token> tokens = tokenizer.parse();
        Assert.assertTrue(tokens.isEmpty());
    }

    @Test
    public void parseInvalidExpressionParseExceptionTest() throws ParseException {
        String mockString = "Invalid_Expression";
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(mockString, mockConfig);
        tokenizer.parse();
    }

    @Test
    public void parseValidExpressionTest() throws ParseException {
        String mockString = "1 + 1";
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(mockString, mockConfig);
        List<Token> tokens = tokenizer.parse();

        Assert.assertNotNull(tokens);
        Assert.assertFalse(tokens.isEmpty());
    }

    @Test
    public void parseStringLiteralInvalidParseExceptionTest() throws ParseException {
        String mockString = "Invalid_string_literal";
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(mockString, mockConfig);
        tokenizer.parseStringLiteral();
    }

    @Test
    public void parseStringLiteralValidTest() throws ParseException {
        String mockString = "\"Valid string literal\"";
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(mockString, mockConfig);
        Token token = tokenizer.parseStringLiteral();

        Assert.assertNotNull(token);
    }

}