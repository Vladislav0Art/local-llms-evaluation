package com.ezylang.evalex.parser;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.parser.Token.TokenType;
import org.junit.Test;

import java.util.List;

public class GeneratedTest {

    @Test
    public void parseValidExpressionTest() throws ParseException {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        when(config.getOperatorDictionary()).thenReturn(mock(OperatorDictionaryIfc.class));
        when(config.getFunctionDictionary()).thenReturn(mock(FunctionDictionaryIfc.class));
        when(config.isImplicitMultiplicationAllowed()).thenReturn(true);
        Tokenizer tokenizer = new Tokenizer("1+1", config);
        List<Token> tokens = tokenizer.parse();

        assertEquals(3, tokens.size());
        assertEquals(TokenType.NUMBER_LITERAL, tokens.get(0).getType());
        assertEquals(TokenType.INFIX_OPERATOR, tokens.get(1).getType());
        assertEquals(TokenType.NUMBER_LITERAL, tokens.get(2).getType());
    }

    @Test
    public void parseInvalidExpressionTest() throws ParseException {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        when(config.getOperatorDictionary()).thenReturn(mock(OperatorDictionaryIfc.class));
        when(config.getFunctionDictionary()).thenReturn(mock(FunctionDictionaryIfc.class));
        Tokenizer tokenizer = new Tokenizer("1++1", config);
        tokenizer.parse();
    }

    @Test
    public void implicitMultiplicationPossibleTest() throws ParseException {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        when(config.getOperatorDictionary()).thenReturn(mock(OperatorDictionaryIfc.class));
        when(config.getFunctionDictionary()).thenReturn(mock(FunctionDictionaryIfc.class));
        when(config.isImplicitMultiplicationAllowed()).thenReturn(true);
        Tokenizer tokenizer = new Tokenizer("2(2+2)2", config);
        List<Token> tokens = tokenizer.parse();

        assertEquals(9, tokens.size());
        assertEquals(TokenType.NUMBER_LITERAL, tokens.get(0).getType());

        // Asserting the artificially inserted multiplication sign
        assertEquals(TokenType.INFIX_OPERATOR, tokens.get(1).getType());
        assertEquals("*", tokens.get(1).getText());
    }

    @Test
    public void validateTokenTest() throws ParseException {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        when(config.getOperatorDictionary()).thenReturn(mock(OperatorDictionaryIfc.class));
        when(config.getFunctionDictionary()).thenReturn(mock(FunctionDictionaryIfc.class));
        when(config.isImplicitMultiplicationAllowed()).thenReturn(true);
        Tokenizer tokenizer = new Tokenizer("2*(2+2)*2", config);
        List<Token> tokens = tokenizer.parse();

        assertEquals(7, tokens.size());
        assertEquals(TokenType.BRACE_OPEN, tokens.get(2).getType());
        assertEquals(TokenType.INFIX_OPERATOR, tokens.get(3).getType());
        assertEquals(TokenType.BRACE_CLOSE, tokens.get(5).getType());
    }

    @Test
    public void validateTokenInvalidTest() throws ParseException {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        when(config.getOperatorDictionary()).thenReturn(mock(OperatorDictionaryIfc.class));
        when(config.getFunctionDictionary()).thenReturn(mock(FunctionDictionaryIfc.class));
        Tokenizer tokenizer = new Tokenizer("2*(+2)*2", config);
        tokenizer.parse();
    }

    @Test
    public void parseStringLiteralTest() throws ParseException {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        when(config.getOperatorDictionary()).thenReturn(mock(OperatorDictionaryIfc.class));
        when(config.getFunctionDictionary()).thenReturn(mock(FunctionDictionaryIfc.class));
        Tokenizer tokenizer = new Tokenizer("\"test\"", config);
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());
        assertEquals(TokenType.STRING_LITERAL, tokens.get(0).getType());
    }

}