package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedConstructorInitializationTest {

    @Test
    public void constructorInitializationTest() {
        String expressionString = "expression_string";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        assertNotNull(tokenizer);
    }

}