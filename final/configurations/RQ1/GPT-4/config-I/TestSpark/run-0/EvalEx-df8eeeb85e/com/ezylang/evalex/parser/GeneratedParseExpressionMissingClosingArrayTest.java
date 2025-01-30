package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class GeneratedParseExpressionMissingClosingArrayTest {

    @Test
    public void parseExpressionMissingClosingArrayTest() throws ParseException {
        ExpressionConfiguration mockConfiguration = Mockito.mock(ExpressionConfiguration.class);
        Mockito.when(mockConfiguration.isArraysAllowed()).thenReturn(true);
        Tokenizer tokenizer = new Tokenizer("1,[2,3", mockConfiguration);
        tokenizer.parse();
    }

}