package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Token.*;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void test_parseStringLiteral_Simple() {
        String expression = "1+2*3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        when(expressionToConfig(expression)).thenReturn(configuration);
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> result = tokenizer.parse();
        assertEquals(2, result.size());
    }

    @Test
    public void test_parseStringLiteral_Brackets() {
        String expression = "(1+2)*3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        when(expressionToConfig(expression)).thenReturn(configuration);
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> result = tokenizer.parse();
        assertEquals(2, result.size());
    }

    @Test
    public void test_parseStringLiteral_Dot() {
        String expression = ".1+2*3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        when(expressionToConfig(expression)).thenReturn(configuration);
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> result = tokenizer.parse();
        assertEquals(4, result.size());
    }

    @Test
    public void test_parseStringLiteral_NoArithmeticOperators() {
        String expression = "abc+";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        when(expressionToConfig(expression)).thenReturn(configuration);
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> result = tokenizer.parse();
        assertEquals(1, result.size());
    }

    @Test
    public void test_parseStringLiteral_NoParentheses() {
        String expression = "a+b";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        when(expressionToConfig(expression)).thenReturn(configuration);
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> result = tokenizer.parse();
        assertEquals(2, result.size());
    }

    @Test
    public void test_parseStringLiteral_NoNumber() {
        String expression = "a";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        when(expressionToConfig(expression)).thenReturn(configuration);
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> result = tokenizer.parse();
        assertEquals(0, result.size());
    }

    @Test
    public void test_parseStringLiteral_NoCharacter() {
        String expression = "";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        when(expressionToConfig(expression)).thenReturn(configuration);
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> result = tokenizer.parse();
        assertEquals(0, result.size());
    }

    @Test
    public void test_parseStringLiteral_SingleCharacter() {
        String expression = "a";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        when(expressionToConfig(expression)).thenReturn(configuration);
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> result = tokenizer.parse();
        assertEquals(1, result.size());
    }

    @Test
    public void test_parseStringLiteral_NoCharacters() {
        String expression = "";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        when(expressionToConfig(expression)).thenReturn(configuration);
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> result = tokenizer.parse();
        assertEquals(0, result.size());
    }

    @Test
    public void test_parseStringLiteral_EmptyExpression() {
        String expression = "";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        when(expressionToConfig(expression)).thenReturn(configuration);
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> result = tokenizer.parse();
        assertEquals(0, result.size());
    }

    @Test
    public void test_parseStringLiteral_MultipleWords() {
        String expression = "hello world";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        when(expressionToConfig(expression)).thenReturn(configuration);
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> result = tokenizer.parse();
        assertEquals(2, result.size());
    }

    @Test
    public void test_parseStringLiteral_MultipleWords_WithParentheses() {
        String expression = "(hello world)";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        when(expressionToConfig(expression)).thenReturn(configuration);
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> result = tokenizer.parse();
        assertEquals(2, result.size());
    }

    @Test
    public void test_parseStringLiteral_MultipleWords_WithArithmeticOperators() {
        String expression = "(1+2)*3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        when(expressionToConfig(expression)).thenReturn(configuration);
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> result = tokenizer.parse();
        assertEquals(4, result.size());
    }

    @Test
    public void test_parseStringLiteral_MultipleWords_WithNumber() {
        String expression = "(1+2*3)";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        when(expressionToConfig(expression)).thenReturn(configuration);
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> result = tokenizer.parse();
        assertEquals(4, result.size());
    }

    @Test
    public void test_parseStringLiteral_MultipleWords_WithOperator() {
        String expression = "(1+2*3)+";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        when(expressionToConfig(expression)).thenReturn(configuration);
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> result = tokenizer.parse();
        assertEquals(5, result.size());
    }

    @Test
    public void test_parseStringLiteral_Whitespace() {
        String expression = "   ";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        when(expressionToConfig(expression)).thenReturn(configuration);
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> result = tokenizer.parse();
        assertEquals(1, result.size());
    }

    @Test
    public void test_parseStringLiteral_SemiColon() {
        String expression = ";";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        when(expressionToConfig(expression)).thenReturn(configuration);
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> result = tokenizer.parse();
        assertEquals(1, result.size());
    }

}