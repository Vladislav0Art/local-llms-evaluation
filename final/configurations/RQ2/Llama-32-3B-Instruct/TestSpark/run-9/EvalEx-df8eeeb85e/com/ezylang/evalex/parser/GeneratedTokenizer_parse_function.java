package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedTokenizer_parse_function {

    @Test
    public void tokenizer_parse_function() {
        // Arrange
        String expressionString = "sin(1.0)";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        FunctionIfc function = new FunctionIfc();

        // Act
        List<Token> tokens = tokenizer.parse();

        // Assert
        assertEquals(3, tokens.size());
    }

}