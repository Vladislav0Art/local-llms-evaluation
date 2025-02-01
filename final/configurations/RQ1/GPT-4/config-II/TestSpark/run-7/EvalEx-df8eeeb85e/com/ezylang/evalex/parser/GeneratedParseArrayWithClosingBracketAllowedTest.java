package com.ezylang.evalex.parser;

import static org.junit.Assert.*;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import org.junit.Test;

import java.util.List;

public class GeneratedParseArrayWithClosingBracketAllowedTest {

    @Test
    public void parseArrayWithClosingBracketAllowedTest() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        config.enableArrays();
        Tokenizer tokenizer = new Tokenizer("[1, 2, 3]", config);
        List<Token> tokens = tokenizer.parse();
        assertEquals(7, tokens.size());
        assertEquals(new Token(0, "[", Token.TokenType.ARRAY_OPEN), tokens.get(0));
        assertEquals(new Token(5, "]", Token.TokenType.ARRAY_CLOSE), tokens.get(6));
    }

}