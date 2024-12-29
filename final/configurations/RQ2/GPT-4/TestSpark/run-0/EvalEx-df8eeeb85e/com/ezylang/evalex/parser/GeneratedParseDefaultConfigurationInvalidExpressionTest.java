package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;

import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedParseDefaultConfigurationInvalidExpressionTest {

    @Test
    public void parseDefaultConfigurationInvalidExpressionTest() throws ParseException {
        final String expression = "1#1";
        final Tokenizer tokenizer = new Tokenizer(expression, null);

        tokenizer.parse();
    }

}