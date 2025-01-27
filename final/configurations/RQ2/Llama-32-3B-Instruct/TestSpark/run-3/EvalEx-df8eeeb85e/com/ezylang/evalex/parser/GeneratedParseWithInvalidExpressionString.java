package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import com.ezylang.evalex.parser.Token.*;

public class GeneratedParseWithInvalidExpressionString {

    @Test
    public void parseWithInvalidExpressionString() {
        String expressionString = "1 +";
        try {
            new Tokenizer(expressionString, new ExpressionConfiguration()).parse();
            fail("ParseException was not thrown");
        } catch (ParseException e) {
            assertNotNull(e);
        }
    }

    private static class ExpressionConfiguration {
    }

    private static class Literal extends Token {
    }

    private static class Identifier extends Token {
    }

    private static class Operator extends Token {
        public static final int ADD = 0;
    }

}