package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseStringLiteralWhenStringIsEmptyTest {

    @Test
    public void parseStringLiteralWhenStringIsEmptyTest() throws ParseException {
        String expression = "''";
        Tokenizer tokenizer = new Tokenizer(expression, null);
        Token token = tokenizer.parseStringLiteral();
        Assert.assertEquals(Token.TokenType.STRING, token.getType());
        Assert.assertEquals("", token.getValue());
    }

}