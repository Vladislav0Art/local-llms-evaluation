package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void constructorValidExpressionString() {
        String expressionString = "1 + 2 * 3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        assertNotNull(new Tokenizer(expressionString, configuration));
    }

    @Test
    public void parseInvalidExpressionString() {
        String expressionString = "invalid_expression";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        NullPointerException expectedException = null;
        try {
            new Tokenizer(expressionString, configuration);
            fail("Expected ParseException to be thrown");
        } catch (NullPointerException e) {
            assertNull(e);
        }
    }

    @Test
    public void parseValidExpression() {
        String expressionString = "1 + 2 * 3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertNotNull(tokens);
        assertEquals(5, tokens.size());
    }

    @Test
    public void parseValidExpressionWithVariables() {
        String expressionString = "1 + variable";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertNotNull(tokens);
        assertEquals(3, tokens.size());
    }

    @Test
    public void parseValidExpressionWithFunctions() {
        String expressionString = "sin(variable)";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertNotNull(tokens);
        assertEquals(2, tokens.size());
    }

    @Test
    public void parseValidExpressionWithOperators() {
        String expressionString = "1 + 2 * variable";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertNotNull(tokens);
        assertEquals(4, tokens.size());
    }

    @Test
    public void parseValidExpressionWithComments() {
        String expressionString = "/* comment */ 1 + 2 * 3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertNotNull(tokens);
        assertEquals(5, tokens.size());
    }

    @Test
    public void parseValidExpressionWithCommentsAndVariables() {
        String expressionString = "/* comment */ variable + 2";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertNotNull(tokens);
        assertEquals(3, tokens.size());
    }

    @Test
    public void parseValidExpressionWithCommentsAndFunctions() {
        String expressionString = "/* comment */ sin(variable)";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertNotNull(tokens);
        assertEquals(2, tokens.size());
    }

    @Test
    public void parseInvalidVariableName() {
        String expressionString = "variable";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertNotNull(tokens);
        assertEquals(1, tokens.size());
        assertEquals(VariableToken.class, tokens.get(0).getClass());
    }

    @Test
    public void parseInvalidFunctionName() {
        String expressionString = "invalid_function";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertNotNull(tokens);
        assertEquals(1, tokens.size());
        assertEquals(FunctionToken.class, tokens.get(0).getClass());
    }

    @Test
    public void parseInvalidOperator() {
        String expressionString = "invalid_operator";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertNotNull(tokens);
        assertEquals(1, tokens.size());
        assertEquals(InvalidOperatorToken.class, tokens.get(0).getClass());
    }

    @Test
    public void parseEmptyExpression() {
        String expressionString = "";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertNotNull(tokens);
        assertEquals(1, tokens.size());
        assertEquals(InvalidToken.class, tokens.get(0).getClass());
    }

    @Test
    public void parseStringLiteral() {
        String expressionString = "'string_literal'";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        Token token = tokenizer.parseStringLiteral();
        assertNotNull(token);
        assertEquals(StringLiteralToken.class, token.getClass());
    }

    @Test
    public void parseStringLiteralWithEscapes() {
        String expressionString = "'string\\n_literal'";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        Token token = tokenizer.parseStringLiteral();
        assertNotNull(token);
        assertEquals(StringLiteralToken.class, token.getClass());
    }

}