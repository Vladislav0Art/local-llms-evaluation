package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedConstructTokenizerWithNullExpressionStringTest {

    @Test
    public void constructTokenizerWithNullExpressionStringTest() {
        try {
            new Tokenizer(null, Mockito.mock(ExpressionConfiguration.class));
            Assert.fail("NullPointerException was not thrown for null expression string");
        } catch (NullPointerException e) {
            // Expected behavior
        }
    }

}