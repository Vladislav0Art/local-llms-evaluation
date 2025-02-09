package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.ezylang.evalex.parser.Token;

import java.util.List;

public class GeneratedParseExpressionWithFunctionTest {

    @Test
    public void parseExpressionWithFunctionTest() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("5+MAX(2,3)*10", configuration);
        List<Token> tokens = tokenizer.parse();
        assertNotNull(tokens);
        assertEquals(7, tokens.size());
        assertEquals("5", tokens.get(0).surface);
        assertEquals("+", tokens.get(1).surface);
        assertEquals("MAX", tokens.get(2).surface);
        assertEquals("2", tokens.get(3).surface);
        assertEquals(",", tokens.get(4).surface);
        assertEquals("3", tokens.get(5).surface);
        assertEquals("*", tokens.get(6).surface);
        assertEquals("10", tokens.get(7).surface);
    }

}