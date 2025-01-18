package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedParseStringLiteralInvalidTest {

    @Test
    public void parseStringLiteralInvalidTest() throws ParseException {
        String expressionString = "Hello, World!";
        Tokenizer tokenizer = new Tokenizer(expressionString, null);
        tokenizer.parseStringLiteral();
    }

}