package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedTokenizer_parse_invalid_expression {

    @Test
    public void tokenizer_parse_invalid_expression() {
        // Arrange
        String expressionString = "1 + 2 *";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        // Act and Assert
        try {
            tokenizer.parse();
            assert false;
        } catch (ParseException e) {
            // Expected exception
        }
    }

}