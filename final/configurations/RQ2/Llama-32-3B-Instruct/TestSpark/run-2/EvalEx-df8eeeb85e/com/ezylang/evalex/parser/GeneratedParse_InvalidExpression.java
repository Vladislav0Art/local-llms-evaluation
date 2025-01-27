package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedParse_InvalidExpression {

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
    public void parse_InvalidExpression() throws ParseException {
        throwExpectException(tokenizer.parse(), ParseException.class);
    }

    private static class ParseException extends Exception {
    }

    private void throwExpectException(Runnable code, Class<?> exceptionType) {
        try {
            code.run();
            fail("Expected exception not thrown");
        } catch (Exception e) {
            assertTrue(e instanceof exceptionType);
        }
    }

}