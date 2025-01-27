package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedParse {

    @Test
    public void parse() {
        Tokenizer tokenizer = new Tokenizer("expression", null);
        List<Token> tokens = tokenizer.parse();
        assertTrue(tokens.size() > 0);
    }

}