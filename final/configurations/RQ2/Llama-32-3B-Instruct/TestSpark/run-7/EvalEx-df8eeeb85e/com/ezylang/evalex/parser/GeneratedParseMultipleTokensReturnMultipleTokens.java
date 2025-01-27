package com.ezylang.evalex.parser;

import java.util.Arrays;
import java.util.List;

public class GeneratedParseMultipleTokensReturnMultipleTokens {

    @Mock
    private ExpressionConfiguration configuration;

    public static class Matcher {
        public static void is(Object actual, Object expected) {
            // implement is method here
        }
    }

    @Test
    public void parseMultipleTokensReturnMultipleTokens() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("token1 token2", configuration);
        List<Token> expectedTokens = Arrays.asList(
                new Token(TokenType.Token, "token1"),
                new Token(TokenType.Token, "token2")
        );
        List<Token> actualTokens = tokenizer.parse();
        Matcher.is(actualTokens, expectedTokens);
    }

}