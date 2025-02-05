package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void parseValidExpressionTest() throws ParseException {
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("3+2", mockConfig);
        List<Token> tokens = tokenizer.parse();
        assertEquals(3, tokens.size());
    }

    @Test
    public void parseInvalidExpressionTest() throws ParseException {
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("3+@2", mockConfig);
        tokenizer.parse();
    }

    @Test
    public void parseEmptyExpressionTest() throws ParseException {
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("", mockConfig);
        List<Token> tokens = tokenizer.parse();
        assertEquals(0, tokens.size());
    }

    @Test
    public void parseStringLiteralTest() throws ParseException {
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("\"Hello\"", mockConfig);
        Token token = tokenizer.parseStringLiteral();
        assertEquals(Token.TokenType.LITERAL, token.getType());
        assertEquals("Hello", token.getValue());
    }

    @Test
    public void parseInvalidStringLiteralTest() throws ParseException {
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("\"Hello", mockConfig);
        tokenizer.parseStringLiteral();
    }

    @Test
    public void parseEmptyStringLiteralTest() throws ParseException {
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("", mockConfig);
        tokenizer.parseStringLiteral();
    }

}