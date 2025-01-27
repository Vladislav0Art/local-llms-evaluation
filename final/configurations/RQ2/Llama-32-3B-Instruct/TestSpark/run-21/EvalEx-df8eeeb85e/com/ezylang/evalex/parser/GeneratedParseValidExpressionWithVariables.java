package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneratedParseValidExpressionWithVariables {

    @Test
    public void parseValidExpressionWithVariables() {
        String expressionString = "1 + variable";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertNotNull(tokens);
        assertEquals(3, tokens.size());
    }

}