package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseSuccessTest {

    @Test
    public void parseSuccessTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Mockito.when(configuration.getFunctionDictionary()).thenReturn(null);
        Mockito.when(configuration.getOperatorDictionary()).thenReturn(null);
        Tokenizer tokenizer = new Tokenizer("1+2", configuration);
        List<Token> tokens = tokenizer.parse();
        Assert.assertNotNull(tokens);
    }

}