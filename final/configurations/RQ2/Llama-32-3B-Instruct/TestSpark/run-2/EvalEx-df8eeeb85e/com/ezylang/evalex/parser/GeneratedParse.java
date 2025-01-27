package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedParse {

    public Tokenizer tokenizer = new Tokenizer("expression", ExpressionConfiguration.getConfiguration());

    private static class OperatorDictionaryIfc {
        public static final class Token {
        }

        public abstract Token getToken(String symbol);
    }

    public static class FunctionDictionaryIfc {
        public static final class Token {
        }

        public abstract Token getToken(String symbol);
    }

    @Test
    public void parse() {
        List<Token> tokens = tokenizer.parse();
        assertNotNull(tokens);
        assertTrue(tokens.size() > 0);
    }

}