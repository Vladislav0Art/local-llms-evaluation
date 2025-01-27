package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneratedParseStringLiteral {

    @Test
    public void parseStringLiteral() {
        String expressionString = "'string_literal'";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        Token token = tokenizer.parseStringLiteral();
        assertNotNull(token);
        assertEquals(StringLiteralToken.class, token.getClass());
    }

}