package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedParseEmptyExpression {

    @Test
    public void parseEmptyExpression() {
        Tokenizer tokenizer = new Tokenizer("", null);
        List<Token> tokens = tokenizer.parse();
        assertTrue(tokens.isEmpty());
    }

}