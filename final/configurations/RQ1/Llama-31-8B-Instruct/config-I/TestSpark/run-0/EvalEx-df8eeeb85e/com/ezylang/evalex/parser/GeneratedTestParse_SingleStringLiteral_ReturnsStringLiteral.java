package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestParse_SingleStringLiteral_ReturnsStringLiteral {

    @Test
    public void testParse_SingleStringLiteral_ReturnsStringLiteral() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("\"hello\"", ExpressionConfiguration.DEFAULT);
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());
        assertEquals(TokenType.STRING_LITERAL, tokens.get(0).getType());
        assertEquals("hello", tokens.get(0).getValue());
    }

}