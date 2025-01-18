package com.ezylang.evalex.parser;

import static org.junit.Assert.*;

import com.ezylang.evalex.config.ExpressionConfiguration;

import java.util.List;

import org.junit.Test;

public class GeneratedParseStringLiteralWithoutQuotesTest {

    @Test
    public void parseStringLiteralWithoutQuotesTest() throws ParseException {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("Hello, World!", configuration);
        Token token = tokenizer.parseStringLiteral();
        assertEquals("Hello, World!", token.getLiteral());
    }

}