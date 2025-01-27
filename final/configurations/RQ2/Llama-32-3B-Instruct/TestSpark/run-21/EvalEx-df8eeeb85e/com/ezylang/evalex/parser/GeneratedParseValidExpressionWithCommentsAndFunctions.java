package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneratedParseValidExpressionWithCommentsAndFunctions {

    @Test
    public void parseValidExpressionWithCommentsAndFunctions() {
        String expressionString = "/* comment */ sin(variable)";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertNotNull(tokens);
        assertEquals(2, tokens.size());
    }

}