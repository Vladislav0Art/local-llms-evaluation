package com.ezylang.evalex.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;

public class GeneratedConstructor_OkayExpression {

    @Test
    public void constructor_OkayExpression() {
        String expressionString = "1+2*3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        configuration.setFunctionDictionaryIfc(new FunctionDictionaryIfc());
        configuration.setOperatorDictionaryIfc(new OperatorDictionaryIfc());

        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
    }

}