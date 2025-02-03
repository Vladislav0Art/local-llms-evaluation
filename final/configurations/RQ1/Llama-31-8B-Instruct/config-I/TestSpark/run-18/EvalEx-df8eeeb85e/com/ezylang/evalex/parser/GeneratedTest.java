package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.config.ExpressionConfiguration;

public class GeneratedTest {

    @Test
    public void testParse_EmptyString() {
        Tokenizer tokenizer = new Tokenizer("", new ExpressionConfiguration());
        try {
            List<Token> tokens = tokenizer.parse();
            assertTrue(tokens.isEmpty());
        } catch (ParseException e) {
            fail();
        }
    }

    @Test
    public void testParse_SingleNumberLiteral() {
        Tokenizer tokenizer = new Tokenizer("123", new ExpressionConfiguration());
        try {
            List<Token> tokens = tokenizer.parse();
            assertEquals(1, tokens.size());
            assertEquals(Token.TokenType.NUMBER_LITERAL, tokens.get(0).getType());
            assertEquals("123", tokens.get(0).getValue());
        } catch (ParseException e) {
            fail();
        }
    }

    @Test
    public void testParse_SingleIdentifier() {
        Tokenizer tokenizer = new Tokenizer("abc", new ExpressionConfiguration());
        try {
            List<Token> tokens = tokenizer.parse();
            assertEquals(1, tokens.size());
            assertEquals(Token.TokenType.VARIABLE_OR_CONSTANT, tokens.get(0).getType());
            assertEquals("abc", tokens.get(0).getValue());
        } catch (ParseException e) {
            fail();
        }
    }

    @Test
    public void testParse_SingleOperator() {
        Tokenizer tokenizer = new Tokenizer("+", new ExpressionConfiguration());
        try {
            List<Token> tokens = tokenizer.parse();
            assertEquals(1, tokens.size());
            assertEquals(Token.TokenType.INFIX_OPERATOR, tokens.get(0).getType());
            assertEquals("+", tokens.get(0).getValue());
        } catch (ParseException e) {
            fail();
        }
    }

    @Test
    public void testParse_SingleStringLiteral() {
        Tokenizer tokenizer = new Tokenizer("\"hello\"", new ExpressionConfiguration());
        try {
            List<Token> tokens = tokenizer.parse();
            assertEquals(1, tokens.size());
            assertEquals(Token.TokenType.STRING_LITERAL, tokens.get(0).getType());
            assertEquals("hello", tokens.get(0).getValue());
        } catch (ParseException e) {
            fail();
        }
    }

}