package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseStringLiteralTest {

    @Test
    public void parseStringLiteralTest() throws ParseException {
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        String mockExpression = "\"Hello World\"";
        Tokenizer tokenizer = new Tokenizer(mockExpression, mockConfig);
        Token token = tokenizer.parseStringLiteral();
        Assert.assertEquals(Token.TokenType.STRING_LITERAL, token.getType());
    }

}