package com.ezylang.evalex.parser;

import java.util.Arrays;
import java.util.List;

public class GeneratedParseMultipleNumberLiteralsReturnMultipleNumberLiterals {

    @Mock
    private ExpressionConfiguration configuration;

    public static class Matcher {
        public static void is(Object actual, Object expected) {
            // implement is method here
        }
    }

    @Test
    public void parseMultipleNumberLiteralsReturnMultipleNumberLiterals() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("1.23 456", configuration);
        List<Token> expectedTokens = Arrays.asList(
                new Token(TokenType.NumberLiteral, "1.23"),
                new Token(TokenType.NumberLiteral, "456")
        );
        List<Token> actualTokens = tokenizer.parse();
        Matcher.is(actualTokens, expectedTokens);
    }

}