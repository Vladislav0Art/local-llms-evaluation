package com.ezylang.evalex.parser;

import static org.junit.Assert.*;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import org.junit.Test;

import java.util.List;

public class GeneratedParseNumberLiteralDecimalTest {

    @Test
    public void parseNumberLiteralDecimalTest() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("123.456", config);
        List<Token> tokens = tokenizer.parse();
        assertEquals(
                new Token(0, "123.456", Token.TokenType.NUMBER_LITERAL),
                tokens.get(0));
    }

}