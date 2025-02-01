package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseIdentifierTest {

    @Test
    public void parseIdentifierTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("abc123_test", config);
        Token token = tokenizer.parse().get(0);

        assertEquals("abc123_test", token.getValue());
    }

}