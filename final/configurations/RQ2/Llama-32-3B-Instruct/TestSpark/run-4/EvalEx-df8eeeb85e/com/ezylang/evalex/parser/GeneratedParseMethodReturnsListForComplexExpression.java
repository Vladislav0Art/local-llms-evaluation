package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedParseMethodReturnsListForComplexExpression {

    @Test
    public void parseMethodReturnsListForComplexExpression() {
        String expressionString = "1+(2*3)";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        List<Token> result = Tokenizer.parse(expressionString, configuration);
        assertEquals(6, result.size());
    }

}