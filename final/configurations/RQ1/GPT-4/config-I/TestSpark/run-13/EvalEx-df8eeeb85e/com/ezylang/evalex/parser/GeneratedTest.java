package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void parseUnbalancedParenthesisTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("10 * (9 + 8", configuration);
        tokenizer.parse();
    }

    @Test
    public void parseSingleTokenTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("10", configuration);
        Assert.assertEquals(1, tokenizer.parse().size());
    }

    @Test
    public void parseMultipleTokensTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("10 * (9 + 8)", configuration);
        Assert.assertEquals(6, tokenizer.parse().size());
    }

    @Test
    public void parseParsingValidExpressionTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("10 + 20", configuration);
        Assert.assertEquals(3, tokenizer.parse().size());
    }

    @Test
    public void parseInvalidExpressionTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Mockito.when(configuration.getOperatorDictionary().hasInfixOperator("invalid")).thenReturn(false);
        Tokenizer tokenizer = new Tokenizer("10 + invalid", configuration);
        tokenizer.parse();
    }

    @Test
    public void parseInvalidTokenAfterOperatorTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Mockito.when(configuration.isImplicitMultiplicationAllowed()).thenReturn(true);
        Tokenizer tokenizer = new Tokenizer("10 +)", configuration);
        tokenizer.parse();
    }

    @Test
    public void parseInvalidStringLiteralTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("\"Test", configuration);
        tokenizer.parse();
    }

    @Test
    public void parseValidStringLiteralTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("\"Test\"", configuration);
        Token token = tokenizer.parse().get(0);
        Assert.assertEquals(Token.TokenType.STRING_LITERAL, token.getType());
        Assert.assertEquals("Test", token.getValue());
    }

}