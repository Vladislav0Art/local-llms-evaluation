package com.ezylang.evalex.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GeneratedParseStringLiteral_validLiteral {

    @Test
    public void parseStringLiteral_validLiteral() {
        Tokenizer tokenizer = new Tokenizer("'hello'", new ExpressionConfiguration());
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());

        assertTrue(tokens.get(0).getType() == STRING_LITERAL);
        assertEquals("hello", tokens.get(0).getStringValue());
    }

}