package com.ezylang.evalex.parser;

import static com.ezylang.evalex.parser.Token.TokenType.*;

import com.ezylang.evalex.parser.Tokenizer;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void testParseStringLiteralEmptyExpression() {
        String expressionString = "1 + 2";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse().getTokens();
        assertEquals(0, tokens.size());
    }

    @Test
    public void testParseStringLiteralNumberExpression() {
        String expressionString = "1 + 2";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse().getTokens();
        assertEquals(1, tokens.size());
        assertEquals(ExpressionType.NUMBER_TOKEN_TYPE, tokens.get(0).getType());
    }

    @Test
    public void testParseStringLiteralVariableExpression() {
        String expressionString = "a";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse().getTokens();
        assertEquals(1, tokens.size());
        assertEquals(ExpressionType.VARIABLE_TOKEN_TYPE, tokens.get(0).getType());
    }

    @Test
    public void testParseStringLiteralFunctionCall() {
        String expressionString = "a.b";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse().getTokens();
        assertEquals(2, tokens.size());
        assertEquals(ExpressionType.FUNCTION_CALL_TOKEN_TYPE, tokens.get(0).getType());
    }

    @Test
    public void testParseStringLiteralVariable() {
        String expressionString = "a";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse().getTokens();
        assertEquals(1, tokens.size());
        assertEquals(ExpressionType.VARIABLE_TOKEN_TYPE, tokens.get(0).getType());
    }

    @Test
    public void testParseVariableExpression() {
        String expressionString = "a";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse().getTokens();
        assertEquals(1, tokens.size());
        assertEquals(ExpressionType.VARIABLE_TOKEN_TYPE, tokens.get(0).getType());
    }

    @Test
    public void testParseFunctionCall() {
        String expressionString = "a.b";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse().getTokens();
        assertEquals(2, tokens.size());
        assertEquals(ExpressionType.FUNCTION_CALL_TOKEN_TYPE, tokens.get(0).getType());
    }

}