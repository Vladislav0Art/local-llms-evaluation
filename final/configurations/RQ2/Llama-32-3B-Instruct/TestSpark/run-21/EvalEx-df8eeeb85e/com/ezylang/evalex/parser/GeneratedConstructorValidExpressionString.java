package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneratedConstructorValidExpressionString {

    @Test
    public void constructorValidExpressionString() {
        String expressionString = "1 + 2 * 3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        assertNotNull(new Tokenizer(expressionString, configuration));
    }

}