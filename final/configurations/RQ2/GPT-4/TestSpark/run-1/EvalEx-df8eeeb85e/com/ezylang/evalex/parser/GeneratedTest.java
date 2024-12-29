package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedTest {

    @Test
    public void TokenizerConstructorTest() {
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        String mockExpression = "3 + 2";
        Tokenizer tokenizer = new Tokenizer(mockExpression, mockConfig);
        Assert.assertNotNull(tokenizer);
    }

    @Test
    public void parseExpressionWithTwoOperandsTest() throws ParseException {
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        String mockExpression = "3 + 2";
        Tokenizer tokenizer = new Tokenizer(mockExpression, mockConfig);
        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(3, tokens.size());
    }

    @Test
    public void parseEmptyExpressionTest() throws ParseException {
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        String mockExpression = "";
        Tokenizer tokenizer = new Tokenizer(mockExpression, mockConfig);
        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(0, tokens.size());
    }

    @Test
    public void parseInvalidExpressionTest() throws ParseException {
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        String mockExpression = "3 +";
        Tokenizer tokenizer = new Tokenizer(mockExpression, mockConfig);
        tokenizer.parse();
    }

    @Test
    public void parseStringLiteralTest() throws ParseException {
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        String mockExpression = "\"Hello World\"";
        Tokenizer tokenizer = new Tokenizer(mockExpression, mockConfig);
        Token token = tokenizer.parseStringLiteral();
        Assert.assertEquals(Token.TokenType.STRING_LITERAL, token.getType());
    }

    @Test
    public void parseInvalidStringLiteralTest() throws ParseException {
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        String mockExpression = "\"Hello World";
        Tokenizer tokenizer = new Tokenizer(mockExpression, mockConfig);
        tokenizer.parseStringLiteral();
    }

}