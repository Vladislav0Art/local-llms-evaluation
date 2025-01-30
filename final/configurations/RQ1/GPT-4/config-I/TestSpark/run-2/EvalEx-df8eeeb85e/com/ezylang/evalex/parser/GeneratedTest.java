package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void parseEmptyExpressionTest() throws ParseException {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("", config);
        Assert.assertTrue(tokenizer.parse().isEmpty());
    }

    @Test
    public void parseSimpleExpressionTest() throws ParseException {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        when(config.isImplicitMultiplicationAllowed()).thenReturn(true);
        Tokenizer tokenizer = new Tokenizer("1+1", config);
        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(3, tokens.size());
    }

    @Test
    public void parseExpressionWithParenthesesTest() throws ParseException {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        when(config.isImplicitMultiplicationAllowed()).thenReturn(true);
        Tokenizer tokenizer = new Tokenizer("(1+1)*2", config);
        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(5, tokens.size());
    }

    @Test
    public void parseExpressionWithMissingClosingParenthesesTest() throws ParseException {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("(1+1*2", config);
        thrown.expect(ParseException.class);
        thrown.expectMessage("Closing brace not found");
        tokenizer.parse();
    }

    @Test
    public void parseExpressionWithExtraClosingParenthesesTest() throws ParseException {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("1+1)*2", config);
        thrown.expect(ParseException.class);
        thrown.expectMessage("Unexpected closing brace");
        tokenizer.parse();
    }

    @Test
    public void parseExpressionWithMissingOperatorTest() throws ParseException {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        when(config.isImplicitMultiplicationAllowed()).thenReturn(false);
        Tokenizer tokenizer = new Tokenizer("1 1", config);
        thrown.expect(ParseException.class);
        thrown.expectMessage("Missing operator");
        tokenizer.parse();
    }

}