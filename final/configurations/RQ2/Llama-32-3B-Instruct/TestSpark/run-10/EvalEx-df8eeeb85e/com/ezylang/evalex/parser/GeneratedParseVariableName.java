package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedParseVariableName {

    @Test
    public void parseVariableName() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("variable", null);
        Token token = tokenizer.parseToken();
        assertNotNull(token);
        assertEquals(Token.Type.VARIABLE, token.getType());
    }

}