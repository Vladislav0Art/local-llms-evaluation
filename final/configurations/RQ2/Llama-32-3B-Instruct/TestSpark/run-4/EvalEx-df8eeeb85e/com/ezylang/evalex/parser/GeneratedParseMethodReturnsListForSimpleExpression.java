package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedParseMethodReturnsListForSimpleExpression {

    @Test
    public void parseMethodReturnsListForSimpleExpression() {
        String expressionString = "1+2";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        List<Token> result = Tokenizer.parse(expressionString, configuration);
        assertEquals(3, result.size());
    }

}