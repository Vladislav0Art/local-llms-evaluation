package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedParseStringLiteralThrowsParseExceptionWhenExpressionIsNotStringLiteral {

    @Test
    public void parseStringLiteralThrowsParseExceptionWhenExpressionIsNotStringLiteral() {
        // Arrange
        String notStringLiteral = "not a string literal";
        Tokenizer tokenizer = new Tokenizer(notStringLiteral, new ExpressionConfiguration());

        // Act & Assert
        try {
            tokenizer.parseStringLiteral();
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
        }
    }

}