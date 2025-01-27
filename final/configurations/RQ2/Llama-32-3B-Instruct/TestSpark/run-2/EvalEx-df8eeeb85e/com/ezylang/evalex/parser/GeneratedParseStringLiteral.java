package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedParseStringLiteral {

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
    public void parseStringLiteral() throws ParseException {
        OperatorDictionaryIfc operatorDictionaryMock = mock(OperatorDictionaryIfc.class);
        when(operatorDictionaryMock.getToken(anyString())).thenReturn(Token.TokenType.END_OF_EXPRESSION);
        Token token = tokenizer.parseStringLiteral();
        assertNotNull(token);
        assertEquals(1, token.getValue().length());
    }

}