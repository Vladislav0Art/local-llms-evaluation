package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseSimpleExpressionTest {

    @Test
    public void parseSimpleExpressionTest() {
        String expression = "3+4";
        Tokenizer tokenizer = new Tokenizer(expression, null);
        try {
            Assert.assertEquals(3, tokenizer.parse().size());
        } catch (ParseException e) {
            Assert.fail(e.getMessage());
        }
    }

}