package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.ezylang.evalex.parser.Token;

import java.util.List;

public class GeneratedParseSimpleExpressionTest {

    @Test
    public void parseSimpleExpressionTest() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("10*2/5", configuration);
        List<Token> tokens = tokenizer.parse();
        assertNotNull(tokens);
        assertEquals(5, tokens.size());
        assertEquals("10", tokens.get(0).surface);
        assertEquals("*", tokens.get(1).surface);
        assertEquals("2", tokens.get(2).surface);
        assertEquals("/", tokens.get(3).surface);
        assertEquals("5", tokens.get(4).surface);
    }

}