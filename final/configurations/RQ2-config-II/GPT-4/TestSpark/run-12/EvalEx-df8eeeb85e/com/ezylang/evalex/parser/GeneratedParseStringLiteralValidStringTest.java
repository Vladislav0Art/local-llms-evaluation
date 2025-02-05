package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedParseStringLiteralValidStringTest {

    @Test
    public void parseStringLiteralValidStringTest() throws ParseException {
        String validStringLiteral = "\"Hello, World!\"";
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);

        Tokenizer tokenizer = new Tokenizer(validStringLiteral, config);
        Token result = tokenizer.parseStringLiteral();

        assertNotNull(result);
        assertEquals("\"Hello, World!\"", result.getSurface());
    }

}