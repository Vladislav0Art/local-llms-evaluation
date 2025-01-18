package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        String expressionString = "5 + 3";

        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        Assert.assertNotNull(tokenizer);
    }

}