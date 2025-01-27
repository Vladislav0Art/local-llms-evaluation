package com.ezylang.evalex.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GeneratedNewTokenizer_emptyString {

    @Test
    public void newTokenizer_emptyString() {
        Tokenizer tokenizer = new Tokenizer("", new ExpressionConfiguration());
        List<Token> tokens = tokenizer.parse();
        assertEquals(0, tokens.size());
    }

}