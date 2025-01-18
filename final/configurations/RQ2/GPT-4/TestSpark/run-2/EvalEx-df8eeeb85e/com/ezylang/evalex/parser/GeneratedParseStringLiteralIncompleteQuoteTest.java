package com.ezylang.evalex.parser;

import static org.junit.Assert.*;

import com.ezylang.evalex.config.ExpressionConfiguration;

import java.util.List;

import org.junit.Test;

public class GeneratedParseStringLiteralIncompleteQuoteTest {

    @Test
    public void parseStringLiteralIncompleteQuoteTest() throws ParseException {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("\"Hello, World!", configuration);
        tokenizer.parseStringLiteral(); // This should throw the exception
    }

}