package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedTokenizer_parse_empty {

    @Test
    public void tokenizer_parse_empty() {
        // Arrange
        String expressionString = "";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        // Act
        List<Token> tokens = tokenizer.parse();

        // Assert
        assertTrue(tokens.isEmpty());
    }

}