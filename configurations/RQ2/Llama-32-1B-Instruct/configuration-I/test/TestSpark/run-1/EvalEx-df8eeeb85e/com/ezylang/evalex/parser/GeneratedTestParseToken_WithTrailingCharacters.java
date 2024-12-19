package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestParseToken_WithTrailingCharacters {

    @Test
    public void testParseToken_WithTrailingCharacters() {
        String expression = "*a";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new Token(0, "token", 1));
        Mockito.when(tokenizer.parseToken()).thenReturn(expectedTokens);
        List<Token> actualTokens = tokenizer.parse();
        assertEquals(expectedTokens, actualTokens);
    }

}