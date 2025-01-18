package com.ezylang.evalex.parser;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;

public class GeneratedTest {

    @Test
    public void tokenizerConstructorValidArgumentsTest() {
        String testExpression = "2+2";
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(testExpression, configuration);
        assertNotNull(tokenizer);
    }

    @Test
    public void parseValidExpressionTest() throws ParseException {
        String testExpression = "2+2";
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(testExpression, configuration);
        List<Token> parsedResponse = tokenizer.parse();
        assertEquals(3, parsedResponse.size());  // 2 numbers and an operator: [2, +, 2]
    }

    @Test
    public void parseInvalidExpressionTest() throws ParseException {
        String testExpression = "2+2d"; // 'd' is not a valid number or operator
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(testExpression, configuration);
        tokenizer.parse();
    }

    @Test
    public void parseStringLiteralValidTest() throws ParseException {
        String testExpression = "\"hello\"";
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        new Tokenizer(testExpression, configuration).parseStringLiteral();
    }

    @Test
    public void parseStringLiteralInvalidTest() throws ParseException {
        String testExpression = "\"hello";
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        new Tokenizer(testExpression, configuration).parseStringLiteral();
    }

}