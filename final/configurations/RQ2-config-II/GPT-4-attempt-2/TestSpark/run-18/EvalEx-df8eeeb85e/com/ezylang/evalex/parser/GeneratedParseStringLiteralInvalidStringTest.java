package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedParseStringLiteralInvalidStringTest {

    @Test
    public void parseStringLiteralInvalidStringTest() throws ParseException {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        when(config.getStringLiteralQuotes()).thenReturn(new char[]{'\"', '\''});

        Tokenizer tokenizer = new Tokenizer("Invalid String", config);
        tokenizer.parseStringLiteral();
    }

}