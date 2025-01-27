package com.ezylang.evalex.parser;

import java.util.Arrays;
import java.util.List;

public class GeneratedParseNumberLiteralFloatReturnNumberLiteralToken {

    @Mock
    private ExpressionConfiguration configuration;

    public static class Matcher {
        public static void is(Object actual, Object expected) {
            // implement is method here
        }
    }

    @Test
    public void parseNumberLiteralFloatReturnNumberLiteralToken() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("1.23", configuration);
        Token expectedToken = new Token(TokenType.NumberLiteral, "1.23");
        Token actualToken = tokenizer.parseStringLiteral();
        Matcher.is(actualToken, expectedToken);
    }

}