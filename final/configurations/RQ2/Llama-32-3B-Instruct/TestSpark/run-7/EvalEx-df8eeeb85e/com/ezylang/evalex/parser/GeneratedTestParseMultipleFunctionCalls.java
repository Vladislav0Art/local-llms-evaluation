package com.ezylang.evalex.parser;

import java.util.Arrays;
import java.util.List;

public class GeneratedTestParseMultipleFunctionCalls {

    @Mock
    private ExpressionConfiguration configuration;

    public static class Matcher {
        public static void is(Object actual, Object expected) {
            // implement is method here
        }
    }

    @Test
    public void testParseMultipleFunctionCalls() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("function(token) function(other)", configuration);
        try {
            tokenizer.parse();
            Fail();
        } catch (ParseException e) {
            // expected
        }
    }

    private static void Fail() {
        throw new AssertionError("Expected Parse exception");
    }

}