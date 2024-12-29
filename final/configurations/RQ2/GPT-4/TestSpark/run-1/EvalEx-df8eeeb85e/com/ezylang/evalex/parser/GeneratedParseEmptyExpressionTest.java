package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseEmptyExpressionTest {

    @Test
    public void parseEmptyExpressionTest() throws ParseException {
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        String mockExpression = "";
        Tokenizer tokenizer = new Tokenizer(mockExpression, mockConfig);
        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(0, tokens.size());
    }

}