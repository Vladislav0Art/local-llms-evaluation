package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void [Tokenizer][Scenario]

    Test_parseStringLiteral() {
        String expression = "123";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionaryIfc = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDictIfc = new OperatorDictionaryIfc();

        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new Token(TokenTypeNUMBER, 123, null));
        tokenizer.parse().forEach(token -> {
            if (token.getType() == TokenType.NUMBER) {
                assert token.equals(expectedTokens.get(0));
            }
        });

        tokenizer.clearTokens();
    }

    @Test
    public void [Tokenizer][Scenario]

    Test_parseLiteralExpression() {
        String expression = "1 + 2";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionaryIfc = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDictIfc = new OperatorDictionaryIfc();

        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new Token(TokenTypeNUMBER, 1, null));
        expectedTokens.add(new Token(TokenTypePLUS, 2, null));
        tokenizer.parse().forEach(token -> {
            if (token.getType() == TokenType.NUMBER) {
                assert token.equals(expectedTokens.get(0));
            }
            if (token.getType() == TokenType.PLUS) {
                assert token.equals(expectedTokens.get(1));
            }
        });

        tokenizer.clearTokens();
    }

    @Test
    public void [Tokenizer][Scenario]

    Test_parseVariableExpression() {
        String expression = "x";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionaryIfc = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDictIfc = new OperatorDictionaryIfc();

        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new Token(TokenTypeVARIABLE, "x", null));
        tokenizer.parse().forEach(token -> {
            if (token.getType() == TokenType.VARIABLE) {
                assert token.equals(expectedTokens.get(0));
            }
        });

        tokenizer.clearTokens();
    }

    @Test
    public void [Tokenizer][Scenario]

    Test_parseConstantExpression() {
        String expression = "5";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionaryIfc = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDictIfc = new OperatorDictionaryIfc();

        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new Token(TokenTypeNUMBER, 5, null));
        tokenizer.parse().forEach(token -> {
            if (token.getType() == TokenType.NUMBER) {
                assert token.equals(expectedTokens.get(0));
            }
        });

        tokenizer.clearTokens();
    }

    @Test
    public void [Tokenizer][Scenario]

    Test_parseInvalidExpression() {
        String expression = "abc";
        ExpressionConfiguration configuration = new ExpressionConfiguration();

        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> expectedTokens = new ArrayList<>();
        // should throw ParseException
    }

}