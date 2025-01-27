package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

public class GeneratedParseEmptyExpressionReturnsEmptyList {

    @Test
    public void parseEmptyExpressionReturnsEmptyList() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("", ExpressionConfiguration.create());
        List<Token> tokens = tokenizer.parse();
        assertTrue(tokens.isEmpty());
    }

}