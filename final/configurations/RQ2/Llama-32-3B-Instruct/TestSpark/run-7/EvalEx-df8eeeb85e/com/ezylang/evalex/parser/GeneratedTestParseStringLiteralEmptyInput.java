package com.ezylang.evalex.parser;

import java.util.Arrays;
import java.util.List;

public class GeneratedTestParseStringLiteralEmptyInput {

    @Mock
    private ExpressionConfiguration configuration;

    public static class Matcher {
        public static void is(Object actual, Object expected) {
            // implement is method here
        }
    }

    @Test
    public void testParseStringLiteralEmptyInput() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("\"", configuration);
        try {
            tokenizer.parseStringLiteral();
            Fail();
        } catch (ParseException e) {
            // expected
        }
    }

}