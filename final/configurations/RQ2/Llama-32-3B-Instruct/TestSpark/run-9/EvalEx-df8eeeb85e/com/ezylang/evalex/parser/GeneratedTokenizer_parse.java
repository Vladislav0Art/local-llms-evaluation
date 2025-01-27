package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedTokenizer_parse {

    @Test
    public void tokenizer_parse() {
        // Arrange
        String expressionString = "1 + 2 * 3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        // Act
        List<Token> tokens = tokenizer.parse();

        // Assert
        assertEquals(5, tokens.size());
    }

}