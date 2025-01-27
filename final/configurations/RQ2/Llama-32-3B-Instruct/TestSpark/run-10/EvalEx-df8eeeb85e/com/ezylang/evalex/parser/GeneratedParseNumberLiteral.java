package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedParseNumberLiteral {

    @Test
    public void parseNumberLiteral() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("123", null);
        Token token = tokenizer.parseToken();
        assertNotNull(token);
        assertEquals(LongValue.LITERAL, (long) token.getValue().getType(), token.getValue().getValue());
    }

}