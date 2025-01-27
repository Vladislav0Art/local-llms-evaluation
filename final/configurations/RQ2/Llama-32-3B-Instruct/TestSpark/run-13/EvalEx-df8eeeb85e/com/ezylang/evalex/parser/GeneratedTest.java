package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void testAdd() {
        // Arrange
        String expression = "1 + 2 * 3";
        String expectedValue = "5";

        // Act
        Tokenizer tokenizer = new Tokenizer(expression, new ExpressionConfiguration());
        int index = 0;
        while (tokenizer.nextToken(index) != null) {
            if (tokenizer.getCurrentToken().getType() == TokenType.ADD) {
                assertEquals(expectedValue, Integer.toString(tokenizer.getCurrentToken().getNumber()));
            }
            index++;
        }
    }

    @Test
    public void testStringLiteral() {
        // Arrange
        String input = "'";
        String expectedValue = "'h'";

        // Act
        Tokenizer tokenizer = new Tokenizer(input, new ExpressionConfiguration());
        int index = 0;
        while (tokenizer.nextToken(index) != null) {
            if (tokenizer.getCurrentToken().getType() == TokenType.STRING_LITERAL) {
                assertEquals(expectedValue, tokenizer.getCurrentToken().getValue());
            }
            index++;
        }

    }
}

class Tokenizer {
    private String expression;
    private ExpressionConfiguration configuration;

    public Tokenizer(String expression, ExpressionConfiguration configuration) {
        this.expression = expression;
        this.configuration = configuration;
    }

    public Token getCurrentToken(int index) {
        if (index >= expression.length()) {
            return null;
        }
        int start = index;
        while (index < expression.length() && !Character.isWhitespace(expression.charAt(index))) {
            index++;
        }
        String tokenValue = expression.substring(start, index);
        switch (configuration.getType(tokenValue)) {
            case ADD:
                return new Token(tokenValue, TokenType.ADD);
            case STRING_LITERAL:
                return new Token("'" + tokenValue + "'", TokenType.STRING_LITERAL);
            default:
                return null;
        }
    }

    public void nextToken(int index) {
        getCurrentToken(index);
    }
}

public class ExpressionConfiguration {
    private Map<String, TokenType> typeMap;

    public ExpressionConfiguration() {
        this.typeMap = new HashMap<>();
        typeMap.put("add", TokenType.ADD);
        typeMap.put("multiply", TokenType.MULITIPLY);
        typeMap.put("'h'", TokenType.STRING_LITERAL);
    }

    public TokenType getType(String tokenValue) {
        return typeMap.get(tokenValue);
    }

}