package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeneratedTokenizerConstructorWithNullOrEmptyExpressionStringTest {

    @Test
    public void tokenizerConstructorWithNullOrEmptyExpressionStringTest() {
        try {
            new Tokenizer("", new ExpressionConfiguration());
            Assert.fail("Expected IllegalArgumentException with string empty");
        } catch (IllegalArgumentException e) {
            // Success
        }

        try {
            new Tokenizer(null, new ExpressionConfiguration());
            Assert.fail("Expected IllegalArgumentException with string null");
        } catch (IllegalArgumentException e) {
            // Success
        }
    }

}