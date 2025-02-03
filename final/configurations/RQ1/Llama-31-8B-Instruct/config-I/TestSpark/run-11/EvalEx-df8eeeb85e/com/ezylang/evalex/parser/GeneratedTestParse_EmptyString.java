package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

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