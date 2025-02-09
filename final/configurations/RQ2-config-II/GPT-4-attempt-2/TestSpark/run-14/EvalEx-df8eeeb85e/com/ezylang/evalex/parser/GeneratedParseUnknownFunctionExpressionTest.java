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

public class GeneratedParseUnknownFunctionExpressionTest {

    @Test
    public void parseUnknownFunctionExpressionTest() throws ParseException {
        ExpressionConfiguration expressionConfiguration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("UNKNOWN(1)", expressionConfiguration);
        tokenizer.parse();
    }

}