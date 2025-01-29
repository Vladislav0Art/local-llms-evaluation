package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    private Tokenizer tokenizer = new Tokenizer("1 + 2", ExpressionConfiguration.DEFAULT);

    @Test
    public void parseStringLiteralTest() {
        when(expressionString()).thenReturn("1 + 2");
        List<Token> tokens = tokenizer.parse();
        assertEquals(3, tokens.size());
        assertEquals(new NumberToken(1), tokens.get(0));
        assertEquals("+", tokens.get(1).getType());
        assertEquals(new NumberToken(2), tokens.get(2));
    }

    @Test
    public void parseVariableIdentifierTest() {
        when(expressionString()).thenReturn("x");
        List<Token> tokens = tokenizer.parse();
        assertEquals(3, tokens.size());
        assertEquals(new IdentifierToken("x"), tokens.get(0));
    }

    @Test
    public void parseFunctionIdentifierTest() {
        when(expressionString()).thenReturn("myFunc");
        List<Token> tokens = tokenizer.parse();
        assertEquals(4, tokens.size());
        assertEquals(new FunctionIdentifierToken("myFunc"), tokens.get(0));
    }

    @Test
    public void parseConstantLiteralTest() {
        when(expressionString()).thenReturn("5");
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());
        assertEquals(new ConstantLiteralToken(5), tokens.get(0));
    }

    @Test
    public void parseKeywordLiteralTest() {
        when(expressionString()).thenReturn("#define");
        List<Token> tokens = tokenizer.parse();
        assertEquals(3, tokens.size());
        assertEquals(new KeywordLiteralToken("#define"), tokens.get(0));
    }

    @Test
    public void parseNumberLiteralTest() {
        when(expressionString()).thenReturn("5.5");
        List<Token> tokens = tokenizer.parse();
        assertEquals(2, tokens.size());
        assertEquals(new NumberLiteralToken(5.5), tokens.get(0));
    }

    @Test
    public void parseOperatorLiteralTest() {
        when(expressionString()).thenReturn("+");
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());
        assertEquals(new OperatorLiteralToken("+"), tokens.get(0));
    }

}