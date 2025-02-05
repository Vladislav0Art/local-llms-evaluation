package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseStringLiteralSuccessTest {

    @Test
    public void parseStringLiteralSuccessTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Mockito.when(configuration.getFunctionDictionary()).thenReturn(null);
        Mockito.when(configuration.getOperatorDictionary()).thenReturn(null);
        Tokenizer tokenizer = new Tokenizer("\"1+2\"", configuration);
        Token token = tokenizer.parseStringLiteral();
        Assert.assertEquals(Token.TokenType.LITERAL, token.type);
    }

}