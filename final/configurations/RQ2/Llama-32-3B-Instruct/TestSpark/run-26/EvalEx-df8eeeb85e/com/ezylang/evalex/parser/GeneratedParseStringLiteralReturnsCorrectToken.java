package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.List;

public class GeneratedParseStringLiteralReturnsCorrectToken {

    @Test
    public void parseStringLiteralReturnsCorrectToken() {
        String expressionString = "'hello'";
        Tokenizer tokenizer = new Tokenizer(expressionString, new ExpressionConfiguration());
        Token token = tokenizer.parseStringLiteral();
        assertThat(token.getValue(), is("'hello'"));
    }

}