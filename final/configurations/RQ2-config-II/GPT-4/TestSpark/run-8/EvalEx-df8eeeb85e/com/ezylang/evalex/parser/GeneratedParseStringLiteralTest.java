package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseStringLiteralTest {

    @Test
    public void parseStringLiteralTest() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("\"Hello World\" ", configuration);

        Token token = tokenizer.parseStringLiteral();

        assertNotNull(token);
        assertEquals(Token.TokenType.TT_STRING, token.type);
        assertEquals("Hello World", token.surface.toUpperCase());
    }

}