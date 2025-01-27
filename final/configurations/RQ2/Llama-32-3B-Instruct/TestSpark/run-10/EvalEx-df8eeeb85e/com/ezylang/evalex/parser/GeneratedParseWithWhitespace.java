package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedParseWithWhitespace {

    @Test
    public void parseWithWhitespace() {
        Tokenizer tokenizer = new Tokenizer(" expression ", null);
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());
    }

}