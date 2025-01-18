package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

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

    @Test
    public void parseWhenExpressionHasInvalidCharacterTest() throws ParseException {
        String expression = "3+%4";
        Tokenizer tokenizer = new Tokenizer(expression, null);
        tokenizer.parse();
    }

    @Test
    public void parseStringLiteralWhenStringIsNotTerminatedTest() throws ParseException {
        String expression = "'HelloWorld";
        Tokenizer tokenizer = new Tokenizer(expression, null);
        tokenizer.parseStringLiteral();
    }

}