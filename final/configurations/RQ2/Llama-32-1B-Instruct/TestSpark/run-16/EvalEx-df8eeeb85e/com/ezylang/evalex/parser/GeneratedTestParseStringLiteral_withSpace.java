package com.ezylang.evalex.parser;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.MockedStatic.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestParseStringLiteral_withSpace {

    private Tokenizer tokenizer;

    @BeforeEach
    public void setup() {
        when(expressionConfiguration()).thenReturn(new ExpressionConfiguration());
        tokenizer = new Tokenizer("1 + 2", new ExpressionConfiguration());
    }

    @Test
    public void testParseStringLiteral_withSpace() throws ParseException {
        // Arrange
        String expressionString = "1 + 2   ";
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new Token(TokenType INT, 1));
        expectedTokens.add(new Token(TokenType STR, "1"));
        expectedTokens.add(new Token(TokenType ADDITION, 2));
        expectedTokens.add(new Token(TokenType STR, "+"));

        // Act
        List<Token> tokens = tokenizer.parse();

        // Assert
        assertEquals(expectedTokens, tokens);
    }

}