package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("1+2", configuration);
        Assert.assertNotNull(tokenizer);
    }

    @Test
    public void parseWithParseExceptionTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("1+2", configuration);
        tokenizer.parse();
    }

    @Test
    public void parseSuccessTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Mockito.when(configuration.getFunctionDictionary()).thenReturn(null);
        Mockito.when(configuration.getOperatorDictionary()).thenReturn(null);
        Tokenizer tokenizer = new Tokenizer("1+2", configuration);
        List<Token> tokens = tokenizer.parse();
        Assert.assertNotNull(tokens);
    }

    @Test
    public void parseStringLiteralWithParseExceptionTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("\"1+2\"", configuration);
        tokenizer.parseStringLiteral();
    }

    @Test
    public void parseStringLiteralSuccessTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Mockito.when(configuration.getFunctionDictionary()).thenReturn(null);
        Mockito.when(configuration.getOperatorDictionary()).thenReturn(null);
        Tokenizer tokenizer = new Tokenizer("\"1+2\"", configuration);
        Token token = tokenizer.parseStringLiteral();
        Assert.assertEquals(Token.TokenType.LITERAL, token.type);
    }

}