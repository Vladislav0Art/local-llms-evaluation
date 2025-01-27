package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

public class GeneratedParseStringLiteralInvalidEscapeSequenceThrowsParseException {

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