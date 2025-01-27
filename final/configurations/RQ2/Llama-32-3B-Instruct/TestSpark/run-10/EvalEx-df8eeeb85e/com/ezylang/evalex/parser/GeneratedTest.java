package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    @Test
    public void parse() {
        Tokenizer tokenizer = new Tokenizer("expression", null);
        List<Token> tokens = tokenizer.parse();
        assertTrue(tokens.size() > 0);
    }

    @Test
    public void parseEmptyExpression() {
        Tokenizer tokenizer = new Tokenizer("", null);
        List<Token> tokens = tokenizer.parse();
        assertTrue(tokens.isEmpty());
    }

    @Test
    public void parseWithWhitespace() {
        Tokenizer tokenizer = new Tokenizer(" expression ", null);
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());
    }

    @Test
    public void parseStringLiteral() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("\"literal\"", null);
        Token token = tokenizer.parseStringLiteral();
        assertNotNull(token);
        assertEquals("literal", token.getValue());
    }

    @Test
    public void parseStringLiteralEmpty() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("\"\"", null);
        Token token = tokenizer.parseStringLiteral();
        assertNull(token);
    }

    @Test
    public void parseStringLiteralInvalid() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("\"", null);
        assertThrows(ParseException.class, () -> tokenizer.parseStringLiteral());
    }

    @Test
    public void parseVariableName() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("variable", null);
        Token token = tokenizer.parseToken();
        assertNotNull(token);
        assertEquals(Token.Type.VARIABLE, token.getType());
    }

    @Test
    public void parseNumberLiteral() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("123", null);
        Token token = tokenizer.parseToken();
        assertNotNull(token);
        assertEquals(LongValue.LITERAL, (long) token.getValue().getType(), token.getValue().getValue());
    }

    @Test
    public void parseInvalidExpression() throws ParseException {
        Tokenizer tokenizer = new Tokenizer(" invalid_expression ", null);
        assertThrows(ParseException.class, () -> tokenizer.parse());
    }

}