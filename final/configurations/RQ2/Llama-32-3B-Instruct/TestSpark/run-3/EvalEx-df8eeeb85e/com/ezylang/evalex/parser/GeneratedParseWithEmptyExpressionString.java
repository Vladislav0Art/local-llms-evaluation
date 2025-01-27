package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import com.ezylang.evalex.parser.Token.*;

public class GeneratedParseWithEmptyExpressionString {

    @Test
    public void parseWithEmptyExpressionString() {
        Tokenizer tokenizer = new Tokenizer("", new ExpressionConfiguration());
        assertTrue(tokenizer.parse().isEmpty());
    }

}