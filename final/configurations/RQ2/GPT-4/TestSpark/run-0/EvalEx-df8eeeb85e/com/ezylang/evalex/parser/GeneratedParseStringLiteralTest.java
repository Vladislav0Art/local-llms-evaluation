package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedParseStringLiteralTest {

    @Test
    public void parseStringLiteralTest() throws ParseException {
        final String expression = "'hello world'";
        final ExpressionConfiguration config = new ExpressionConfiguration();
        final Tokenizer tokenizer = new Tokenizer(expression, config);

        Token token = tokenizer.parseStringLiteral();

        Assert.assertNotNull(token);
        Assert.assertEquals("hello world", token.getSurface());
    }

}