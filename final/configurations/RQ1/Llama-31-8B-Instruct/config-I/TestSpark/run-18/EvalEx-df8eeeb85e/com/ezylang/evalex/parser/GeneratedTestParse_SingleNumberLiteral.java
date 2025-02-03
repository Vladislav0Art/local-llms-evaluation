package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.config.ExpressionConfiguration;

public class GeneratedTestParse_SingleNumberLiteral {

    @Test
    public void testParse_SingleNumberLiteral() {
        Tokenizer tokenizer = new Tokenizer("123", new ExpressionConfiguration());
        try {
            List<Token> tokens = tokenizer.parse();
            assertEquals(1, tokens.size());
            assertEquals(Token.TokenType.NUMBER_LITERAL, tokens.get(0).getType());
            assertEquals("123", tokens.get(0).getValue());
        } catch (ParseException e) {
            fail();
        }
    }

}