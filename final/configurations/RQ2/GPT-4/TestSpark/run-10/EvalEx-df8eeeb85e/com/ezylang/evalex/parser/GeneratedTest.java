package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorTest() {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);

        Tokenizer tokenizer = new Tokenizer("3+5", configuration);

        assertNotNull(tokenizer);
    }

    @Test
    public void parseStringLiteralValidTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("\"Test String\"", configuration);

        Token result = tokenizer.parseStringLiteral();

        assertEquals("\"Test String\"", result.toString());
    }

    @Test
    public void parseStringLiteralInvalidTest() throws ParseException {
        thrown.expect(ParseException.class);
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("Test String", configuration);

        tokenizer.parseStringLiteral();
    }

    @Test
    public void parseValidExpressionTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("3-5", configuration);

        List<Token> result = tokenizer.parse();

        assertEquals(3, result.size());
        assertEquals("NUMBER(3)", result.get(0).toString());
        assertEquals("OPERATOR(-)", result.get(1).toString());
        assertEquals("NUMBER(5)", result.get(2).toString());
    }

    @Test
    public void parseEmptyExpressionTest() throws ParseException {
        thrown.expect(ParseException.class);
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("", configuration);

        tokenizer.parse();
    }

}