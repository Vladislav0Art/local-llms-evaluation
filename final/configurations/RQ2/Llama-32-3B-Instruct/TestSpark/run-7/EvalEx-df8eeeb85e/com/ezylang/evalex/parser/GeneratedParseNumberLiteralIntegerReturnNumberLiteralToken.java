package com.ezylang.evalex.parser;

import java.util.Arrays;
import java.util.List;

public class GeneratedParseNumberLiteralIntegerReturnNumberLiteralToken {

    @Mock
    private ExpressionConfiguration configuration;

    public static class Matcher {
        public static void is(Object actual, Object expected) {
            // implement is method here
        }
    }

    @Test
    public void parseNumberLiteralIntegerReturnNumberLiteralToken() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("123", configuration);
        Token expectedToken = new Token(TokenType.NumberLiteral, "123");
        Token actualToken = tokenizer.parseStringLiteral();
        Matcher.is(actualToken, expectedToken);
    }

}