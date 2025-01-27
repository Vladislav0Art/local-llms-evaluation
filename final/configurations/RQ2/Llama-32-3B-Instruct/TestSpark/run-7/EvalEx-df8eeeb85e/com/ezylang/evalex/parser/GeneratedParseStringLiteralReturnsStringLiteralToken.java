package com.ezylang.evalex.parser;

import java.util.Arrays;
import java.util.List;

public class GeneratedParseStringLiteralReturnsStringLiteralToken {

    @Mock
    private ExpressionConfiguration configuration;

    public static class Matcher {
        public static void is(Object actual, Object expected) {
            // implement is method here
        }
    }

    @Test
    public void parseStringLiteralReturnsStringLiteralToken() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("\"token\"", configuration);
        Token expectedToken = new Token(TokenType.StringLiteral, "token");
        Token actualToken = tokenizer.parseStringLiteral();
        Matcher.is(actualToken, expectedToken);
    }

}