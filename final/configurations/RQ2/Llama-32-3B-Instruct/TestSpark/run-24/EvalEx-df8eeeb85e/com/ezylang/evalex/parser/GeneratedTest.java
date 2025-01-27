package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

import static com.ezylang.evalex.parser.Token.TokenType.*;

public class GeneratedTest {

    @Test
    public void createTokenizerWithExpressionStringAndConfiguration() {
        String expressionString = "1+2*3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        // Set any needed configuration properties here
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
    }

    @Test
    public void parseMethodReturnsCorrectlyFormattedTokenList() throws ParseException {
        String expressionString = "1+2*3";
        List<Token> tokens = new Tokenizer(expressionString).parse();
        assertTrue(tokens.size() == 5);
        assertEquals(PLUS, tokens.get(0).getType());
        assertEquals(NUMBER, tokens.get(1).getType());
        assertEquals(NUMBER, tokens.get(2).getType());
        assertEquals(MULTIPLY, tokens.get(3).getType());
        assertEquals(NUMBER, tokens.get(4).getType());
    }

    @Test
    public void parseStringLiteralReturnsCorrectToken() throws ParseException {
        String expressionString = "\"hello\"";
        Token token = new Tokenizer(expressionString).parseStringLiteral();
        assertTrue(token.getType() == STRING);
        assertEquals("hello", token.getValue());
    }

    @Test
    public void parseMethodThrowsParseExceptionForInvalidExpression() {
        String expressionString = "1+2*3";
        ExpressionConfiguration configuration = new ExpressionConfiguration(); // Set any needed configuration properties here
        assertThrows(ParseException.class, () -> new Tokenizer(expressionString, configuration).parse());
    }

    @Test
    public void parseMethodReturnsCorrectlyFormattedTokenListForMultipleExpressions() throws ParseException {
        String expressionString1 = "1+2*3";
        String expressionString2 = "4/5";
        List<Token> tokens = new Tokenizer(expressionString1 + expressionString2).parse();
        assertTrue(tokens.size() == 9);
    }

    @Test
    public void parseMethodReturnsCorrectlyFormattedTokenListForMultipleExpressionsWithFunctions() throws ParseException {
        String expressionString1 = "1+2*3";
        String functionExpression = "sin(45)";
        List<Token> tokens = new Tokenizer(expressionString1 + functionExpression).parse();
        assertTrue(tokens.size() == 9);
    }

}