package com.ezylang.evalex.parser;

import static org.junit.Assert.*;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import org.junit.Test;

import java.util.List;

public class GeneratedTest {

    @Test
    public void parseEmptyStringTest() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("", config);
        List<Token> tokens = tokenizer.parse();
        assertTrue(tokens.isEmpty());
    }

    @Test
    public void parseInvalidStringTest() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("\"invalid", config);
        tokenizer.parse();
    }

    @Test
    public void parseValidStringTest() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("\"valid\"", config);
        List<Token> tokens = tokenizer.parse();
        assertEquals(
                new Token(0, "valid", Token.TokenType.STRING_LITERAL),
                tokens.get(0));
    }

    @Test
    public void validateTokenUnexpectedTokenAfterInfixOperatorTest() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("2+*", config);
        try {
            tokenizer.parse();
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("Unexpected token after infix operator", e.getMessage());
        }
    }

    @Test
    public void parseBraceCloseWithNoOpenBraceTest() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(")", config);
        tokenizer.parse();
    }

    @Test
    public void parseBraceOpenWithoutCloseBraceTest() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("(", config);
        tokenizer.parse();
    }

    @Test
    public void parseArrayWithNoClosingBracketAllowedTest() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("[", config);
        tokenizer.parse();
    }

    @Test
    public void parseArrayWithClosingBracketAllowedTest() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        config.enableArrays();
        Tokenizer tokenizer = new Tokenizer("[1, 2, 3]", config);
        List<Token> tokens = tokenizer.parse();
        assertEquals(7, tokens.size());
        assertEquals(new Token(0, "[", Token.TokenType.ARRAY_OPEN), tokens.get(0));
        assertEquals(new Token(5, "]", Token.TokenType.ARRAY_CLOSE), tokens.get(6));
    }

    @Test
    public void parseUndefinedOperatorTest() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("?", config);
        tokenizer.parse();
    }

    @Test
    public void parseNumberLiteralDecimalTest() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("123.456", config);
        List<Token> tokens = tokenizer.parse();
        assertEquals(
                new Token(0, "123.456", Token.TokenType.NUMBER_LITERAL),
                tokens.get(0));
    }

    @Test
    public void parseNumberLiteralHexadecimalTest() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("0xFF", config);
        List<Token> tokens = tokenizer.parse();
        assertEquals(
                new Token(0, "0xFF", Token.TokenType.NUMBER_LITERAL),
                tokens.get(0));
    }

    @Test
    public void parseValidIdentifierTest() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("myIdentifier123", config);
        List<Token> tokens = tokenizer.parse();
        assertEquals(
                new Token(0, "myIdentifier123", Token.TokenType.VARIABLE_OR_CONSTANT),
                tokens.get(0));
    }

}