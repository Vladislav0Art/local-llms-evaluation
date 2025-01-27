package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;

import java.util.Arrays;

public class GeneratedParse_WithEmptyExpression_ReturnsParseException {

    @Mock
    private ExpressionConfiguration expressionConfiguration;

    public List<Token> parseList() {
        return new ArrayList<>();
    }

    public static class Token {
        public TokenType type;
        public String value;

        public Token(TokenType type, String value) {
        }

        public TokenType getType() {
            return type;
        }
    }

    @Test
    public void parse_WithEmptyExpression_ReturnsParseException() throws ParseException {
        assertionExceptionIsParseException(tokenizer.parse());
    }

    private static class ParseException extends Exception { /* implementation */
    }

    public static class Tokenizer {
        // add the required fields and methods

        private String expressionString;
        private ExpressionConfiguration configuration;

        public Tokenizer(String expressionString, ExpressionConfiguration configuration) {
        }

        public List<Token> parse() throws ParseException {
        }

        public Token parseStringLiteral() throws ParseException {
        }

        public TokenType getType() {
            return null;
        }
    }

}