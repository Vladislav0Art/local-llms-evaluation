package com.ezylang.evalex.parser;

import org.junit.Test;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.ExpressionConfiguration;

import java.text.ParseException;
import java.util.List;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedParseStringLiteralValidInputTest {

    @Test
    public void parseStringLiteralValidInputTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("\"This is a string\"", config);
        Token token = tokenizer.parseStringLiteral();
        assertNotNull(token);
        assertEquals("\"This is a string\"", token.getSurface());
    }

}