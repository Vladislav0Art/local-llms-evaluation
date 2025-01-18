package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedTest {

    @Test
    public void parseValidExpressionTest() throws ParseException {
        String expressionString = "5 + 3";
        Tokenizer tokenizer = new Tokenizer(expressionString, null);
        List<Token> tokens = tokenizer.parse();

        Assert.assertEquals(3, tokens.size());
    }

    @Test
    public void parseInvalidExpressionTest() throws ParseException {
        String expressionString = "5 +";
        Tokenizer tokenizer = new Tokenizer(expressionString, null);
        tokenizer.parse();
    }

    @Test
    public void parseStringLiteralTest() throws ParseException {
        String expressionString = "\"Hello, World!\"";
        Tokenizer tokenizer = new Tokenizer(expressionString, null);
        Token token = tokenizer.parseStringLiteral();

        Assert.assertEquals("\"Hello, World!\"", token.toString());
    }

    @Test
    public void parseStringLiteralInvalidTest() throws ParseException {
        String expressionString = "Hello, World!";
        Tokenizer tokenizer = new Tokenizer(expressionString, null);
        tokenizer.parseStringLiteral();
    }

}