package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void testParseSimpleExpression() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        String expression = "1 + 2";
        List<Token> result = tokenizer.parse(expression);
        assertEquals(4, result.size());
        assertEquals("1", result.get(0).getType());
        assertEquals("+", result.get(1).getType());
        assertEquals("2", result.get(2).getType());
    }

    @Test
    public void testParseInvalidFunction() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        String expression = " invalid function";
        List<Token> result = tokenizer.parse(expression);
        assertEquals(null, result);
    }

    @Test
    public void testParseInvalidOperator() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        String expression = "1 + 2 - ";
        List<Token> result = tokenizer.parse(expression);
        assertEquals(null, result);
    }

    @Test
    public void testParseInvalidFunctionCall() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        String expression = " 1 / 0";
        List<Token> result = tokenizer.parse(expression);
        assertEquals(null, result);
    }

    @Test
    public void testParseMultipleFunctions() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        String expression = " foo() + bar();";
        List<Token> result = tokenizer.parse(expression);
        assertEquals(5, result.size());
        assertEquals("foo", result.get(0).getType());
        assertEquals("+", result.get(1).getType());
        assertEquals("bar", result.get(2).getType());
    }

    @Test
    public void testParseMultipleOperators() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        String expression = " 1 + 2 - 3";
        List<Token> result = tokenizer.parse(expression);
        assertEquals(4, result.size());
        assertEquals("+", result.get(0).getType());
        assertEquals("2", result.get(1).getType());
        assertEquals("-", result.get(2).getType());
        assertEquals("3", result.get(3).getType());
    }

    @Test
    public void testParseMultipleFunctionCalls() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        String expression = " foo(); bar();";
        List<Token> result = tokenizer.parse(expression);
        assertEquals(4, result.size());
        assertEquals("foo", result.get(0).getType());
        assertEquals("()", result.get(1).getType());
        assertEquals("bar", result.get(2).getType());
    }

    @Test
    public void testParseFunctionCallArguments() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        String expression = " foo(1, 2)";
        List<Token> result = tokenizer.parse(expression);
        assertEquals(3, result.size());
        assertEquals("foo", result.get(0).getType());
        assertEquals("(", result.get(1).getType());
        assertEquals("1", result.get(2).getType());
        assertEquals(",", result.get(3).getType());
        assertEquals("2", result.get(4).getType());
    }

    @Test
    public void testParseFunctionCallReturn() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        String expression = " foo() -> 1";
        List<Token> result = tokenizer.parse(expression);
        assertEquals(3, result.size());
        assertEquals("foo", result.get(0).getType());
        assertEquals("(", result.get(1).getType());
        assertEquals("->", result.get(2).getType());
        assertEquals("1", result.get(3).getType());
    }

    @Test
    public void testParseMultipleReturnTypes() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        String expression = " foo(1, 2) -> 1";
        List<Token> result = tokenizer.parse(expression);
        assertEquals(4, result.size());
        assertEquals("foo", result.get(0).getType());
        assertEquals("(", result.get(1).getType());
        assertEquals("1", result.get(2).getType());
        assertEquals(")", result.get(3).getType());
        assertEquals("1", result.get(4).getType());
    }

    @Test
    public void testParseInvalidToken() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        String expression = " invalid";
        List<Token> result = tokenizer.parse(expression);
        assertEquals(null, result);
    }

}