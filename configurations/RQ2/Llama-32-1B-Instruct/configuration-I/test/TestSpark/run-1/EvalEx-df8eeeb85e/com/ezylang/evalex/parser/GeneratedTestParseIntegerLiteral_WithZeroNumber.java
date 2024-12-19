package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestParseIntegerLiteral_WithZeroNumber {

    @Test
    public void testParseIntegerLiteral_WithZeroNumber() {
        String expression = "0";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new Token(0, "integer_literal", 1));
        Mockito.when(tokenizer.parseIntegerLiteral()).thenReturn(expectedTokens);
        List<Token> actualTokens = tokenizer.parse();
        assertEquals(expectedTokens, actualTokens);
    }

}