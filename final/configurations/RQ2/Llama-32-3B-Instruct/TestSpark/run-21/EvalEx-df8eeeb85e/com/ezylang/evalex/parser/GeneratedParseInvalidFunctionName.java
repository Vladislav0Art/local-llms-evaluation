package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneratedParseInvalidFunctionName {

    @Test
    public void parseInvalidFunctionName() {
        String expressionString = "invalid_function";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertNotNull(tokens);
        assertEquals(1, tokens.size());
        assertEquals(FunctionToken.class, tokens.get(0).getClass());
    }

}