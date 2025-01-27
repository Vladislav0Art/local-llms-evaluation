package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.List;

public class GeneratedConstructorParseCorrectly {

    @Test
    public void constructorParseCorrectly() {
        String expressionString = "1 + 2";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        assertThat(tokenizer.parse(), is(notNullValue()));
    }

}