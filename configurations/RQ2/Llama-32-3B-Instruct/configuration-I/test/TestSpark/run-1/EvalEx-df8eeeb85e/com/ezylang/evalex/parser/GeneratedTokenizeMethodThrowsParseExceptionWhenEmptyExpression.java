package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

public class GeneratedTokenizeMethodThrowsParseExceptionWhenEmptyExpression {

    @Test
    public void tokenizeMethodThrowsParseExceptionWhenEmptyExpression() {
        Tokenizer tokenizer = new Tokenizer("");
        assertThrows(ParseException.class, () -> tokenizer.tokenize());
    }
}

public class MockTokenizer implements Tokenizer {
    private String expression;

    public MockTokenizer(String expression) {
        this.expression = expression;
    }

    @Override
    public Token parseStringLiteral() {
        // implementation of parsing logic goes here
        if (expression.equals("'string'")) {
            return new Token("string", TokenType.STRING_LITERAL);
        } else {
            throw new ParseException("Invalid string literal");
        }
    }

    @Override
    public List<Token> tokenize() {
        if (expression.equals("")) {
            throw new ParseException("Empty expression");
        } else {
            List<Token> tokens = new ArrayList<>();
            tokens.add(new Token(expression, TokenType.VARIABLE));
            return tokens;
        }
    }

    @Override
    public Token parse() throws ParseException {
        if (expression.equals("")) {
            throw new ParseException("Empty expression");
        } else {
            List<Token> tokens = new ArrayList<>();
            tokens.add(new Token(expression, TokenType.VARIABLE));
            return tokens.get(0);
        }
    }
}

public class MockTokenizerImpl implements Tokenizer {
    private String expression;

    public MockTokenizerImpl(String expression) {
        this.expression = expression;
    }

    @Override
    public List<Token> parse() throws ParseException {
        if (expression.equals("")) {
            throw new ParseException("Empty expression");
        } else {
            List<Token> tokens = new ArrayList<>();
            tokens.add(new Token(expression, TokenType.VARIABLE));
            return tokens;
        }
    }

    @Override
    public Token parseStringLiteral() throws ParseException {
        // implementation of parsing logic goes here
        if (expression.equals("'string'")) {
            return new Token("string", TokenType.STRING_LITERAL);
        } else {
            throw new ParseException("Invalid string literal");
        }
    }

    @Override
    public List<Token> tokenize() throws ParseException {
        if (expression.equals("")) {
            throw new ParseException("Empty expression");
        } else {
            List<Token> tokens = new ArrayList<>();
            tokens.add(new Token(expression, TokenType.VARIABLE));
            return tokens;
        }
    }
}

public class ParseException extends Exception {
}

}