package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedParseMethodThrowsParseExceptionForInvalidExpression {

    @Test
    public void parseMethodThrowsParseExceptionForInvalidExpression() {
        String expressionString = "1+";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        try {
            Tokenizer.parse(expressionString, configuration);
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
            // expected
        }
    }

}