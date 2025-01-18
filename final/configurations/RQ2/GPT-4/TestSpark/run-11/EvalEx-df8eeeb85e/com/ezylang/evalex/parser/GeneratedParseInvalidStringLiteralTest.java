package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedParseInvalidStringLiteralTest {

    @Test
    public void parseInvalidStringLiteralTest() throws ParseException {
        ExpressionConfiguration mockConfig = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("\"Test", mockConfig);

        tokenizer.parseStringLiteral();
    }

}