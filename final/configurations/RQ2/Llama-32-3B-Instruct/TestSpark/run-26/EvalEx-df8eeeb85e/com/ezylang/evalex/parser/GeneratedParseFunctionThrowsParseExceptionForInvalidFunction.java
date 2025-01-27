package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.List;

public class GeneratedParseFunctionThrowsParseExceptionForInvalidFunction {

    @Test
    public void parseFunctionThrowsParseExceptionForInvalidFunction() {
        String expressionString = "sin";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        assertThrows(ParseException.class, () -> tokenizer.parse());
    }
}

}