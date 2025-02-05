package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void parseValidExpressionTest() {
        String expressionString = "3 + 4";
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        List<Token> result = tokenizer.parse();

        assertEquals(3, result.size());
        assertEquals(Token.TokenType.TT_NUMERIC, result.get(0).getType());
        assertEquals(Token.TokenType.TT_OPERATOR, result.get(1).getType());
        assertEquals(Token.TokenType.TT_NUMERIC, result.get(2).getType());
    }

    @Test
    public void parseInvalidExpressionTest() {
        String expressionString = "3 + ";
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        tokenizer.parse();
    }

    @Test
    public void parseStringLiteralValidTest() {
        String expressionString = "\"hello\"";
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        Token result = tokenizer.parse();

        assertEquals(Token.TokenType.TT_STRING, result.getType());
        assertEquals("hello", result.getValue());
    }

    @Test
    public void parseStringLiteralInvalidTest() {
        String expressionString = "\"hello";
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        tokenizer.parseStringLiteral();
    }

}