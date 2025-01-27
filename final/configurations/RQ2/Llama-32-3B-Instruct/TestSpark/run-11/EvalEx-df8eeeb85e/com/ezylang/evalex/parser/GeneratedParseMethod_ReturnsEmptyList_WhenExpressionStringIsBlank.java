package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedParseMethod_ReturnsEmptyList_WhenExpressionStringIsBlank {

    @Test
    public void parseMethod_ReturnsEmptyList_WhenExpressionStringIsBlank() {
        String expressionString = "";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertTrue(tokens.isEmpty());
    }

}