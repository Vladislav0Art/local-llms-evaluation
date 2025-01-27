package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAdd {

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

}