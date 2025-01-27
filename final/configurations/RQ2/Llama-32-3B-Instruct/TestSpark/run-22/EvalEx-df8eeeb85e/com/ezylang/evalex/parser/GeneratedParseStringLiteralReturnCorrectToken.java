package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

public class GeneratedParseStringLiteralReturnCorrectToken {

    @Test
    public void parseStringLiteralReturnCorrectToken() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("\"hello\"", ExpressionConfiguration.create());
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());
        assertEquals(TokenType.STRING_LITERAL, tokens.get(0).getType());
        assertTrue(tokens.get(0).getValue().equals("hello"));
    }

}