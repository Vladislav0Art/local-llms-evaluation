package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.List;

public class GeneratedParseReturnsCorrectToken {

    @Test
    public void parseReturnsCorrectToken() {
        String expressionString = "1 + 2";
        Tokenizer tokenizer = new Tokenizer(expressionString, mockExpressionConfiguration);
        List<Token> tokens = tokenizer.parse();
        assertThat(tokens.size(), is(3));
    }

}