package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.TokenizerTest;
import org.junit.jupiter.api.Test;

public class GeneratedTest_parseStringLiteral_WithPlusSign {

    private Tokenizer tokenizer = new Tokenizer("1 + 2", ExpressionConfiguration.empty());

    @Test
    public void test_parseStringLiteral_WithPlusSign() {
        List<Token> tokens = tokenizer.parse();
        assertEquals(3, tokens.size());
        assertTrue(tokens.contains(new Token(TokenType.LITERAL, "1 ", String.class)));
        assertTrue(tokens.contains(new Token(TokenType.LITERAL, "+", null)));
        assertTrue(tokens.contains(new Token(TokenType.LITERAL, "2", null)));
    }

}