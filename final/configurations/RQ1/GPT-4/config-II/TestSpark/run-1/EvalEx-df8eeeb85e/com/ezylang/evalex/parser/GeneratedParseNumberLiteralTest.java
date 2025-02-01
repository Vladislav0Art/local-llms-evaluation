package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNumberLiteralTest {

    @Test
    public void parseNumberLiteralTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("123235", config);
        Token token = tokenizer.parse().get(0);

        assertEquals("123235", token.getValue());
    }

}