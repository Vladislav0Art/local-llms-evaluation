package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import com.ezylang.evalex.parser.Token.*;

public class GeneratedConstructorWithValidExpressionStringAndConfiguration {

    @Test
    public void constructorWithValidExpressionStringAndConfiguration() {
        String expressionString = "1 + 2";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        assertNotNull(new Tokenizer(expressionString, configuration).parse());
    }

}