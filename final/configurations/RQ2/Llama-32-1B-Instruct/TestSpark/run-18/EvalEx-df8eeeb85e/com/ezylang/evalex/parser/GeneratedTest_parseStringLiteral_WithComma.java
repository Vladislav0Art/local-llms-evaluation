package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.TokenizerTest;
import org.junit.jupiter.api.Test;

public class GeneratedTest_parseStringLiteral_WithComma {

    private Tokenizer tokenizer = new Tokenizer("1 + 2", ExpressionConfiguration.empty());

    @Test
    public void test_parseStringLiteral_WithComma() {
        List<Token> tokens = tokenizer.parse();
        assertEquals(3, tokens.size());
        assertTrue(tokens.contains(new Token(TokenType.LITERAL, "1 ", String.class)));
        assertTrue(tokens.contains(new Token(TokenType.LITERAL, " + ", String.class)));
        assertTrue(tokens.contains(new Token(TokenType.LITERAL, "2", null)));
    }

}