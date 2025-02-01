package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestParse_SingleBraceOpen_ReturnsBraceOpen {

    @Test
    public void testParse_SingleBraceOpen_ReturnsBraceOpen() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("(", ExpressionConfiguration.DEFAULT);
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());
        assertEquals(TokenType.BRACE_OPEN, tokens.get(0).getType());
        assertEquals("(", tokens.get(0).getValue());
    }

}