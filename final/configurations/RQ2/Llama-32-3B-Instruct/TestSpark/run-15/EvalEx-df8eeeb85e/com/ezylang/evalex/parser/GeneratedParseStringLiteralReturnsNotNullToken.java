package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedParseStringLiteralReturnsNotNullToken {

    @Test
    public void parseStringLiteralReturnsNotNullToken() throws ParseException {
        String expressionString = "\"string_literal\"";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        Token token = tokenizer.parseStringLiteral();
        assertNotNull(token);
    }

}