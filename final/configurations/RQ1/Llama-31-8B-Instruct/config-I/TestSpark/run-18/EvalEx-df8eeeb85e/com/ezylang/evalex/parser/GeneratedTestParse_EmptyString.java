package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.config.ExpressionConfiguration;

public class GeneratedTestParse_EmptyString {

    @Test
    public void testParse_EmptyString() {
        Tokenizer tokenizer = new Tokenizer("", new ExpressionConfiguration());
        try {
            List<Token> tokens = tokenizer.parse();
            assertTrue(tokens.isEmpty());
        } catch (ParseException e) {
            fail();
        }
    }

}