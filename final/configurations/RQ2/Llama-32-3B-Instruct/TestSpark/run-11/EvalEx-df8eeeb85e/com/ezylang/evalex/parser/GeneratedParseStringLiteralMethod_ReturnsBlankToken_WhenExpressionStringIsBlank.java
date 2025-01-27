package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedParseStringLiteralMethod_ReturnsBlankToken_WhenExpressionStringIsBlank {

    @Test
    public void parseStringLiteralMethod_ReturnsBlankToken_WhenExpressionStringIsBlank() {
        String expressionString = "";
        try {
            new Tokenizer(expressionString).parseStringLiteral();
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
            // Expected
        }
    }

}