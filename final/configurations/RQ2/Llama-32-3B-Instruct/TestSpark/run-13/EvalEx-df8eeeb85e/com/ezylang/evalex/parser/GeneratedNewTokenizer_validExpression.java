package com.ezylang.evalex.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GeneratedNewTokenizer_validExpression {

    @Test
    public void newTokenizer_validExpression() {
        Tokenizer tokenizer = new Tokenizer("1 + 2 * 3", new ExpressionConfiguration());
        List<Token> tokens = tokenizer.parse();
        assertEquals(3, tokens.size());

        assertTrue(tokens.get(0).getType() == ADD);
        assertEquals(1, tokens.get(0).getNumber());
        assertEquals(2, tokens.get(1).getNumber());
        assertEquals(ADD, tokens.get(1).getType());
        assertEquals(3, tokens.get(2).getNumber());
        assertEquals(MUL, tokens.get(2).getType());
    }

}