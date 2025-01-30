package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedParseValidStringLiteralTest {

    @Test
    public void parseValidStringLiteralTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("\"Test\"", configuration);
        Token token = tokenizer.parse().get(0);
        Assert.assertEquals(Token.TokenType.STRING_LITERAL, token.getType());
        Assert.assertEquals("Test", token.getValue());
    }

}