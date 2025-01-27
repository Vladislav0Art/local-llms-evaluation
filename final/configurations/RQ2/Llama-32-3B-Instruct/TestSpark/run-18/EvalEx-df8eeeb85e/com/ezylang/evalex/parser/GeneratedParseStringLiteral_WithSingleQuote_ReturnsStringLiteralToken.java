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

public class GeneratedParseStringLiteral_WithSingleQuote_ReturnsStringLiteralToken {

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
    public void parseStringLiteral_WithSingleQuote_ReturnsStringLiteralToken() throws ParseException {
        Token result = tokenizer.parseStringLiteral();
        assertNotNull(result);
        assertEquals(STR, result.getType());
    }

}