package com.ezylang.evalex.parser;

import static org.junit.Assert.*;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import org.junit.Test;

import java.util.List;

public class GeneratedParseEmptyStringTest {

    @Test
    public void parseEmptyStringTest() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("", config);
        List<Token> tokens = tokenizer.parse();
        assertTrue(tokens.isEmpty());
    }

}