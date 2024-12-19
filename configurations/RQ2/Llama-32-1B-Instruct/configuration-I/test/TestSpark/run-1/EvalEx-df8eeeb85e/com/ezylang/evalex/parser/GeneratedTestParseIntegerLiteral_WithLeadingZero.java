package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestParseIntegerLiteral_WithLeadingZero {

    @Test
    public void testParseIntegerLiteral_WithLeadingZero() {
        String expression = "-012";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new Token(0, "integer_literal", 1));
        Mockito.when(tokenizer.parseIntegerLiteral()).thenReturn(expectedTokens);
        List<Token> actualTokens = tokenizer.parse();
        assertEquals(expectedTokens, actualTokens);
    }

}