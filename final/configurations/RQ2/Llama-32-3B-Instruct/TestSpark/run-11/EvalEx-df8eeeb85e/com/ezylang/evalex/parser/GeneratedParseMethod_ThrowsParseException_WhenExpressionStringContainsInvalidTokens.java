package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedParseMethod_ThrowsParseException_WhenExpressionStringContainsInvalidTokens {

    @Test
    public void parseMethod_ThrowsParseException_WhenExpressionStringContainsInvalidTokens() {
        String expressionString = " invalid token ";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        try {
            tokenizer.parse();
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
            // Expected
        }
    }

}