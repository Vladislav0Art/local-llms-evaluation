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

public class GeneratedParseStringLiteralInvalidTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void parseStringLiteralInvalidTest() throws ParseException {
        thrown.expect(ParseException.class);
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("Test String", configuration);

        tokenizer.parseStringLiteral();
    }

}