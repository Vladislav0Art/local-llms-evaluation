package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.List;

public class GeneratedParseThrowsParseExceptionForEmptyExpression {

    @Test
    public void parseThrowsParseExceptionForEmptyExpression() {
        String expressionString = "";
        ExpressionConfiguration configuration = mock(ExpressionConfiguration.class);
        when(configuration.getFunctionDictionaryIfc()).thenReturn(null);
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        assertThrows(ParseException.class, () -> tokenizer.parse());
    }

}