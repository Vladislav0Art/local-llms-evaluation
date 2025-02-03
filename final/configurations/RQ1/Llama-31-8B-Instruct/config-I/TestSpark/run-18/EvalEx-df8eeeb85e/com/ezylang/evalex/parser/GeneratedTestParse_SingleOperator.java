package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.config.ExpressionConfiguration;

public class GeneratedTestParse_SingleOperator {

    @Test
    public void testParse_SingleOperator() {
        Tokenizer tokenizer = new Tokenizer("+", new ExpressionConfiguration());
        try {
            List<Token> tokens = tokenizer.parse();
            assertEquals(1, tokens.size());
            assertEquals(Token.TokenType.INFIX_OPERATOR, tokens.get(0).getType());
            assertEquals("+", tokens.get(0).getValue());
        } catch (ParseException e) {
            fail();
        }
    }

}