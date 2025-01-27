package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedParseMethodThrowsParseExceptionWhenExpressionIsInvalid {

    @Test
    public void parseMethodThrowsParseExceptionWhenExpressionIsInvalid() {
        // Arrange
        String invalidExpression = "invalid expression";
        Tokenizer tokenizer = new Tokenizer(invalidExpression, new ExpressionConfiguration());

        // Act & Assert
        try {
            tokenizer.parse();
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
        }
    }

}