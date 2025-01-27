package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedParse_TwoCharacters {

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
    public void parse_TwoCharacters() throws ParseException {
        OperatorDictionaryIfc operatorDictionaryMock = mock(OperatorDictionaryIfc.class);
        when(operatorDictionaryMock.getToken("ab")).thenReturn(Token.TokenType.OPERATOR);
        List<Token> tokens = tokenizer.parse();
        assertEquals(3, tokens.size());
    }

}