package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.List;

public class GeneratedParseStringLiteralThrowsParseExceptionForEmptyString {

    @Test
    public void parseStringLiteralThrowsParseExceptionForEmptyString() {
        String expressionString = "";
        Tokenizer tokenizer = new Tokenizer(expressionString, new ExpressionConfiguration());
        assertThrows(ParseException.class, () -> tokenizer.parseStringLiteral());
    }
}

}