package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.ezylang.evalex.parser.Token;

import java.util.List;

public class GeneratedParseStringLiteralValidFormatTest {

    @Test
    public void parseStringLiteralValidFormatTest() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("'testStr'", configuration);
        Token token = tokenizer.parseStringLiteral();
        assertNotNull(token);
        assertEquals(TokenType.StringLiteral, token.type);
        assertEquals("testStr", token.surface);
    }

}