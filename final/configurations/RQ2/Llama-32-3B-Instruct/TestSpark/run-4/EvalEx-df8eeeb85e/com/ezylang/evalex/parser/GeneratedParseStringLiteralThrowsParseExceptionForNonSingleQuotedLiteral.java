package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedParseStringLiteralThrowsParseExceptionForNonSingleQuotedLiteral {

    @Test
    public void parseStringLiteralThrowsParseExceptionForNonSingleQuotedLiteral() {
        String expressionString = "\"hello\"";
        try {
            Tokenizer.parseStringLiteral(expressionString);
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
            // expected
        }
    }

}