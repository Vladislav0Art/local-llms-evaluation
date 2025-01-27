package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedParseMethodReturnsCorrectNumberOfTokensForEmptyExpression {

    @Test
    public void parseMethodReturnsCorrectNumberOfTokensForEmptyExpression() {
        // Arrange
        Tokenizer tokenizer = new Tokenizer("", new ExpressionConfiguration());

        // Act
        List<Token> tokens = tokenizer.parse();

        // Assert
        assertEquals(0, tokens.size());
    }

}