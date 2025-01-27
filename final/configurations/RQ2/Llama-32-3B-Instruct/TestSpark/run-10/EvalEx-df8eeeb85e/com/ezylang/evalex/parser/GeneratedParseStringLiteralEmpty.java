package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedParseStringLiteralEmpty {

    @Test
    public void parseStringLiteralEmpty() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("\"\"", null);
        Token token = tokenizer.parseStringLiteral();
        assertNull(token);
    }

}