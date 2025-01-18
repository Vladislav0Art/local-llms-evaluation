package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedParseValidExpressionTest {

    @Test
    public void parseValidExpressionTest() throws ParseException {
        ExpressionConfiguration mockConfig = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("1+2", mockConfig);

        List<Token> tokens = tokenizer.parse();

        assertNotNull(tokens);
        assertEquals(3, tokens.size());
    }

}