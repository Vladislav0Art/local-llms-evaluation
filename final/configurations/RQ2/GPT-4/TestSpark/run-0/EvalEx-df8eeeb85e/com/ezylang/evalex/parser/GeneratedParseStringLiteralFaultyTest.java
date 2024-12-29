package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedParseStringLiteralFaultyTest {

    @Test
    public void parseStringLiteralFaultyTest() throws ParseException {
        final String expression = "'hello world";
        final ExpressionConfiguration config = new ExpressionConfiguration();
        final Tokenizer tokenizer = new Tokenizer(expression, config);

        tokenizer.parseStringLiteral();
    }

}