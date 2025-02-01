package com.ezylang.evalex.parser;

import static org.junit.Assert.*;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import org.junit.Test;

import java.util.List;

public class GeneratedParseNumberLiteralHexadecimalTest {

    @Test
    public void parseNumberLiteralHexadecimalTest() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("0xFF", config);
        List<Token> tokens = tokenizer.parse();
        assertEquals(
                new Token(0, "0xFF", Token.TokenType.NUMBER_LITERAL),
                tokens.get(0));
    }

}