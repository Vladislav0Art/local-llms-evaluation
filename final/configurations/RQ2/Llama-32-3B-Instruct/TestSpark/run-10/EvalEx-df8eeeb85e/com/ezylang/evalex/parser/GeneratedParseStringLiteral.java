package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedParseStringLiteral {

    @Test
    public void parseStringLiteral() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("\"literal\"", null);
        Token token = tokenizer.parseStringLiteral();
        assertNotNull(token);
        assertEquals("literal", token.getValue());
    }

}