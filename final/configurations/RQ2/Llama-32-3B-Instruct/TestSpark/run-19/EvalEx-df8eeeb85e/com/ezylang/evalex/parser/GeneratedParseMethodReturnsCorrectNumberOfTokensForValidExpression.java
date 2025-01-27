package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedParseMethodReturnsCorrectNumberOfTokensForValidExpression {

    @Test
    public void parseMethodReturnsCorrectNumberOfTokensForValidExpression() {
        // Arrange
        String expressionString = "1 + 2 * 3";
        Tokenizer tokenizer = new Tokenizer(expressionString, new ExpressionConfiguration());

        // Act
        List<Token> tokens = tokenizer.parse();

        // Assert
        assertEquals(5, tokens.size());
    }

}