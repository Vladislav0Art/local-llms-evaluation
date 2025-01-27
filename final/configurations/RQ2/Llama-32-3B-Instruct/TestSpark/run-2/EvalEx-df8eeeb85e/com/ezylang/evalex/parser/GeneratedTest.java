package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    public Tokenizer tokenizer = new Tokenizer("expression", ExpressionConfiguration.getConfiguration());

    private static class OperatorDictionaryIfc {
        public static final class Token {
        }

        public abstract Token getToken(String symbol);
    }

    public static class FunctionDictionaryIfc {
        public static final class Token {
        }

        public abstract Token getToken(String symbol);
    }

    @Test
    public void parse() {
        List<Token> tokens = tokenizer.parse();
        assertNotNull(tokens);
        assertTrue(tokens.size() > 0);
    }

    @Test
    public void parse_EmptyString() throws ParseException {
        OperatorDictionaryIfc operatorDictionaryMock = mock(OperatorDictionaryIfc.class);
        when(operatorDictionaryMock.getToken(anyString())).thenReturn(Token.TokenType.END_OF_EXPRESSION);
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());
    }

    @Test
    public void parse_SingleCharacter() throws ParseException {
        OperatorDictionaryIfc operatorDictionaryMock = mock(OperatorDictionaryIfc.class);
        when(operatorDictionaryMock.getToken("a")).thenReturn(Token.TokenType.CHARACTER);
        List<Token> tokens = tokenizer.parse();
        assertEquals(2, tokens.size());
    }

    @Test
    public void parse_TwoCharacters() throws ParseException {
        OperatorDictionaryIfc operatorDictionaryMock = mock(OperatorDictionaryIfc.class);
        when(operatorDictionaryMock.getToken("ab")).thenReturn(Token.TokenType.OPERATOR);
        List<Token> tokens = tokenizer.parse();
        assertEquals(3, tokens.size());
    }

    @Test
    public void parse_InvalidExpression() throws ParseException {
        throwExpectException(tokenizer.parse(), ParseException.class);
    }

    private static class ParseException extends Exception {
    }

    private void throwExpectException(Runnable code, Class<?> exceptionType) {
        try {
            code.run();
            fail("Expected exception not thrown");
        } catch (Exception e) {
            assertTrue(e instanceof exceptionType);
        }
    }

    @Test
    public void parseStringLiteral() throws ParseException {
        OperatorDictionaryIfc operatorDictionaryMock = mock(OperatorDictionaryIfc.class);
        when(operatorDictionaryMock.getToken(anyString())).thenReturn(Token.TokenType.END_OF_EXPRESSION);
        Token token = tokenizer.parseStringLiteral();
        assertNotNull(token);
        assertEquals(1, token.getValue().length());
    }

    @Test
    public void parseStringLiteral_InvalidInput() throws ParseException {
        throwExpectException(() -> tokenizer.parseStringLiteral(), ParseException.class);
    }

}