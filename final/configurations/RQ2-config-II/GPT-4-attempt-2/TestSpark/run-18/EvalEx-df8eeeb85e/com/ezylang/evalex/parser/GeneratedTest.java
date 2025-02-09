package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void parseValidExpressionTest() {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("10 + 20 * 30", config);

        List<Token> tokens = null;
        try {
            tokens = tokenizer.parse();
        } catch (ParseException e) {
            fail("Exception was not expected.");
        }

        assertNotNull(tokens);
        assertFalse(tokens.isEmpty());
    }

    @Test
    public void parseInvalidExpressionTest() throws ParseException {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("10 ## 20 * 30", config);
        tokenizer.parse();
    }

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

    @Test
    public void parseStringLiteralInvalidStringTest() throws ParseException {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        when(config.getStringLiteralQuotes()).thenReturn(new char[]{'\"', '\''});

        Tokenizer tokenizer = new Tokenizer("Invalid String", config);
        tokenizer.parseStringLiteral();
    }

}