package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.ezylang.evalex.parser.Token;

import java.util.List;

public class GeneratedParseExpressionWithInvalidCharacterTest {

    @Test
    public void parseExpressionWithInvalidCharacterTest() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("1+@-3", configuration);
        tokenizer.parse();
    }

}