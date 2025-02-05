package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseValidExpressionTest {

    @Test
    public void parseValidExpressionTest() throws ParseException {
        String mockString = "1 + 1";
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(mockString, mockConfig);
        List<Token> tokens = tokenizer.parse();

        Assert.assertNotNull(tokens);
        Assert.assertFalse(tokens.isEmpty());
    }

}