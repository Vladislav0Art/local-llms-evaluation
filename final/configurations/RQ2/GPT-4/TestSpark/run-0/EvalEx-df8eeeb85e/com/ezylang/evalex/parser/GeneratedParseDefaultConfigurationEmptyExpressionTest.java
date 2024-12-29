package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;

import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedParseDefaultConfigurationEmptyExpressionTest {

    @Test
    public void parseDefaultConfigurationEmptyExpressionTest() throws ParseException {
        final String expression = "";
        final Tokenizer tokenizer = new Tokenizer(expression, null);

        List<Token> tokens = tokenizer.parse();

        assertNotNull(tokens);
        assertTrue(tokens.isEmpty());
    }

}