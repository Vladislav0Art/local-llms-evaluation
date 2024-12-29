package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateTokenizerWithCorrectExpressionAndConfiguration {

    @Test
    public void createTokenizerWithCorrectExpressionAndConfiguration() {
        String expressionString = "1 + 2 * 3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        assertNotNull(tokenizer);
    }

}