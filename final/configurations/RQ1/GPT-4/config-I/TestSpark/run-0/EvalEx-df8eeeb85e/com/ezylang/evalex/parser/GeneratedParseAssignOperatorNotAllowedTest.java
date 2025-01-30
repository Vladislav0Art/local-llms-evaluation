package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class GeneratedParseAssignOperatorNotAllowedTest {

    @Test
    public void parseAssignOperatorNotAllowedTest() throws ParseException {
        ExpressionConfiguration mockConfiguration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("1=2", mockConfiguration);
        tokenizer.parse();
    }

}