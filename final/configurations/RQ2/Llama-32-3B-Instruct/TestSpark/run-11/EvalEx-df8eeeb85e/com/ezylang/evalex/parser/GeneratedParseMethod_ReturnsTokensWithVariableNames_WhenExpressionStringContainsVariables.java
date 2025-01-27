package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedParseMethod_ReturnsTokensWithVariableNames_WhenExpressionStringContainsVariables {

    @Test
    public void parseMethod_ReturnsTokensWithVariableNames_WhenExpressionStringContainsVariables() {
        String expressionString = "x + y";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(2, tokens.size());
        assertTrue(tokens.get(0).getType() == VariableType.X);
        assertTrue(tokens.get(1).getType() == VariableType.Y);
    }

}