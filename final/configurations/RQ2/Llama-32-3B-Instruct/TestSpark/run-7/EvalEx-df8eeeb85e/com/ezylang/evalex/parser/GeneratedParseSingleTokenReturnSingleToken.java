package com.ezylang.evalex.parser;

import java.util.Arrays;
import java.util.List;

public class GeneratedParseSingleTokenReturnSingleToken {

    @Mock
    private ExpressionConfiguration configuration;

    public static class Matcher {
        public static void is(Object actual, Object expected) {
            // implement is method here
        }
    }

    @Test
    public void parseSingleTokenReturnSingleToken() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("token", configuration);
        List<Token> expectedTokens = Arrays.asList(new Token(TokenType.Token, "token"));
        List<Token> actualTokens = tokenizer.parse();
        Matcher.is(actualTokens, expectedTokens);
    }

}