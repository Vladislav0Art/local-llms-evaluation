package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void tokenizerInitializationEmptyExpressionTest() {
        ExpressionConfiguration configuration = mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("", configuration);
        Assert.assertNotNull(tokenizer);
    }

}