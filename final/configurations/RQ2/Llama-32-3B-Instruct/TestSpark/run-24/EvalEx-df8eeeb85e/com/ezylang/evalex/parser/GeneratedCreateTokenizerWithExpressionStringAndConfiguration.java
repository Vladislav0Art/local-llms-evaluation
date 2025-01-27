package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

import static com.ezylang.evalex.parser.Token.TokenType.*;

public class GeneratedCreateTokenizerWithExpressionStringAndConfiguration {

    @Test
    public void createTokenizerWithExpressionStringAndConfiguration() {
        String expressionString = "1+2*3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        // Set any needed configuration properties here
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
    }

}