package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

public class GeneratedTest {

    @Test
    public void constructorValidExpressionStringValidConfigurationCorrectTokenizer() {
        Tokenizer tokenizer = new Tokenizer("expression", ExpressionConfiguration.create());
        assertNotNull(tokenizer);
    }

    @Test
    public void parseEmptyExpressionReturnsEmptyList() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("", ExpressionConfiguration.create());
        List<Token> tokens = tokenizer.parse();
        assertTrue(tokens.isEmpty());
    }

    @Test
    public void parseSingleCharacterReturnCorrectToken() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("+", ExpressionConfiguration.create());
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());
        assertEquals(TokenType.PLUS, tokens.get(0).getType());
    }

    @Test
    public void parseMultipleCharactersReturnCorrectTokens() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("++", ExpressionConfiguration.create());
        List<Token> tokens = tokenizer.parse();
        assertEquals(2, tokens.size());
        assertEquals(TokenType.PLUS, tokens.get(0).getType());
        assertEquals(TokenType.PLUS, tokens.get(1).getType());
    }

    @Test
    public void parseStringLiteralReturnCorrectToken() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("\"hello\"", ExpressionConfiguration.create());
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());
        assertEquals(TokenType.STRING_LITERAL, tokens.get(0).getType());
        assertTrue(tokens.get(0).getValue().equals("hello"));
    }

    @Test
    public void parseStringLiteralInvalidEscapeSequenceThrowsParseException() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("\"\\n\"", ExpressionConfiguration.create());
        assertThrows(ParseException.class, () -> tokenizer.parse());
    }

    private static class Token {
        private TokenType type;
        private String value;

        // getters and setters
    }
}

public class MockTokenizer extends Tokenizer {

    @Override
    protected List<Token> parse() throws ParseException {
        return null;
    }

    @Override
    public Token parseStringLiteral() throws ParseException {
        return new Token();
    }

}