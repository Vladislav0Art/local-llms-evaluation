package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedParseStringLiteralValidStringTest {

    @Test
    public void parseStringLiteralValidStringTest() {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        when(config.getStringLiteralQuotes()).thenReturn(new char[]{'\"', '\''});

        Tokenizer tokenizer = new Tokenizer("\"Hello, World!\"", config);
        Token token = null;

        try {
            token = tokenizer.parseStringLiteral();
        } catch (ParseException e) {
            fail("Exception was not expected.");
        }

        assertNotNull(token);
        assertEquals(Token.TokenType.STRINGPARAM, token.type);
        assertEquals("Hello, World!", token.surface);
    }

}