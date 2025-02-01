package com.ezylang.evalex.parser;

import static org.junit.Assert.*;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import org.junit.Test;

import java.util.List;

public class GeneratedParseValidStringTest {

    @Test
    public void parseValidStringTest() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("\"valid\"", config);
        List<Token> tokens = tokenizer.parse();
        assertEquals(
                new Token(0, "valid", Token.TokenType.STRING_LITERAL),
                tokens.get(0));
    }

}