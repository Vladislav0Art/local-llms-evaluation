package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedParseMethod_ReturnsTokensWithFunctionNames_WhenExpressionStringContainsFunctions {

    @Test
    public void parseMethod_ReturnsTokensWithFunctionNames_WhenExpressionStringContainsFunctions() {
        String expressionString = "sin(x)";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());
        assertTrue(tokens.get(0).getType() == FunctionType.SIN);
    }

}