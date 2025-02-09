package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.ezylang.evalex.parser.Token;

import java.util.List;

public class GeneratedCreateTokenizerTest {

    @Test
    public void createTokenizerTest() {
        ExpressionConfiguration expressionConfiguration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("1+1", expressionConfiguration);
        Assert.assertNotNull(tokenizer);
    }

}