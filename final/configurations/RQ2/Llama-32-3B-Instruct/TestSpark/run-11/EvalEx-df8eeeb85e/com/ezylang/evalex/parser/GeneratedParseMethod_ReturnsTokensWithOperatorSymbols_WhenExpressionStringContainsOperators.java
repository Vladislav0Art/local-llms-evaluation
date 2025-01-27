package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedParseMethod_ReturnsTokensWithOperatorSymbols_WhenExpressionStringContainsOperators {

    @Test
    public void parseMethod_ReturnsTokensWithOperatorSymbols_WhenExpressionStringContainsOperators() {
        String expressionString = "2 + 3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());
        assertTrue(tokens.get(0).getType() == OperatorType.PLUS);
    }

}