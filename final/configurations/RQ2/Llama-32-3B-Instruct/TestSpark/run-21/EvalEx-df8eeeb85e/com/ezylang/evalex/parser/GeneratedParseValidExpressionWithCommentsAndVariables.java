package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneratedParseValidExpressionWithCommentsAndVariables {

    @Test
    public void parseValidExpressionWithCommentsAndVariables() {
        String expressionString = "/* comment */ variable + 2";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertNotNull(tokens);
        assertEquals(3, tokens.size());
    }

}