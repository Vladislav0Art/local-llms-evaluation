package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestParseWhitespace {

    @Test
    public void testParseWhitespace() {
        String expression = "   ";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new Token(0, "whitespace", 1));
        Mockito.when(tokenizer.parseToken()).thenReturn(expectedTokens);
        List<Token> actualTokens = tokenizer.parse();
        assertEquals(expectedTokens, actualTokens);
    }

}