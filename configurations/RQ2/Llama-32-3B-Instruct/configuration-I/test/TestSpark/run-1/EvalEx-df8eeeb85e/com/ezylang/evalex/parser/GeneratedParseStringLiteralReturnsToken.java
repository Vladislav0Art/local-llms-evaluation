package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

public class GeneratedParseStringLiteralReturnsToken {

    @Test
    public void parseStringLiteralReturnsToken() {
        Tokenizer tokenizer = new Tokenizer("'string'");
        Token result = tokenizer.parseStringLiteral();
        assertNotNull(result);
        assertEquals("string", result.getValue());
    }

}