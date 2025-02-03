package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.config.ExpressionConfiguration;

public class GeneratedTestParse_SingleIdentifier {

    @Test
    public void testParse_SingleIdentifier() {
        Tokenizer tokenizer = new Tokenizer("abc", new ExpressionConfiguration());
        try {
            List<Token> tokens = tokenizer.parse();
            assertEquals(1, tokens.size());
            assertEquals(Token.TokenType.VARIABLE_OR_CONSTANT, tokens.get(0).getType());
            assertEquals("abc", tokens.get(0).getValue());
        } catch (ParseException e) {
            fail();
        }
    }

}