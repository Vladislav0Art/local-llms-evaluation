package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedParseInvalidExpressionTest {

    @Test
    public void parseInvalidExpressionTest() throws ParseException {
        String expressionString = "3++2";
        ExpressionConfiguration configuration = mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        tokenizer.parse();
    }

}