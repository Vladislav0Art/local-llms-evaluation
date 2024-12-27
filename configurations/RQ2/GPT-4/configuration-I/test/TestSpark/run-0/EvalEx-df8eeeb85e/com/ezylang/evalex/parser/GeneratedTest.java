package com.ezylang.evalex.parser;

import org.junit.Test;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.ExpressionConfiguration;

import java.text.ParseException;
import java.util.List;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void TokenizerConstructorNullExpressionStringTest() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        try {
            Tokenizer tokenizer = new Tokenizer(null, config);
            fail("Expecting IllegalArgumentException for null expression string");
        } catch (IllegalArgumentException iae) {
            assertEquals(iae.getMessage(), "Expression string cannot be null");
        }
    }

    @Test
    public void TokenizerConstructorNullConfigurationTest() {
        try {
            Tokenizer tokenizer = new Tokenizer("1+1", null);
            fail("Expecting IllegalArgumentException for null configuration");
        } catch (IllegalArgumentException iae) {
            assertEquals(iae.getMessage(), "Configuration object cannot be null");
        }
    }

    @Test
    public void parseNormalScenarioTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration();
        try {
            Tokenizer tokenizer = new Tokenizer("1+1", config);
            List<Token> tokens = tokenizer.parse();
            assertNotNull(tokens);
            assertEquals(3, tokens.size());
        } catch (ParseException pe) {
            fail("ParseException should not be thrown for valid expressions");
        }
    }

    @Test
    public void parseExceptionScenarioTest() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        try {
            Tokenizer tokenizer = new Tokenizer("InvalidExpression", config);
            List<Token> tokens = tokenizer.parse();
            fail("Expecting ParseException for invalid expressions");
        } catch (ParseException pe) { /* Expected Exception */ }
    }

    @Test
    public void parseStringLiteralValidInputTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("\"This is a string\"", config);
        Token token = tokenizer.parseStringLiteral();
        assertNotNull(token);
        assertEquals("\"This is a string\"", token.getSurface());
    }

    @Test
    public void parseStringLiteralInvalidInputTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("This is not a string", config);
        tokenizer.parseStringLiteral();
    }

}