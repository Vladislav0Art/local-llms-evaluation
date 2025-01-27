package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneratedParseInvalidExpressionString {

    @Test
    public void parseInvalidExpressionString() {
        String expressionString = "invalid_expression";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        NullPointerException expectedException = null;
        try {
            new Tokenizer(expressionString, configuration);
            fail("Expected ParseException to be thrown");
        } catch (NullPointerException e) {
            assertNull(e);
        }
    }

}