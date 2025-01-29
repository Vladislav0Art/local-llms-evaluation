package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.TokenizerTest;
import org.junit.jupiter.api.Test;

public class GeneratedTest_parseStringLiteral_WithPlusSignAndComma_WithoutPlus_WhenEmpty {

    private Tokenizer tokenizer = new Tokenizer("1 + 2", ExpressionConfiguration.empty());

    @Test
    public void test_parseStringLiteral_WithPlusSignAndComma_WithoutPlus_WhenEmpty() {
        List<Token> tokens = tokenizer.parse();
        assertEquals(4, tokens.size());
        assertTrue(tokens.contains(new Token(TokenType.LITERAL, "1 ", String.class)));
        assertTrue(tokens.contains(new Token(TokenType.LITERAL, "+", null)));
        assertTrue(tokens.contains(new Token(TokenType.COMMA, ",", null)));
    }

}