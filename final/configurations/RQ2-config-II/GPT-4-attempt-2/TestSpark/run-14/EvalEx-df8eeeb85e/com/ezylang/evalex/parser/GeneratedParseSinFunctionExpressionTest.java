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

public class GeneratedParseSinFunctionExpressionTest {

    @Test
    public void parseSinFunctionExpressionTest() throws ParseException {
        ExpressionConfiguration expressionConfiguration = Mockito.mock(ExpressionConfiguration.class);
        FunctionDictionaryIfc functionDictionaryIfc = Mockito.mock(FunctionDictionaryIfc.class);
        Mockito.when(expressionConfiguration.getFunctionDictionary()).thenReturn(functionDictionaryIfc);
        Mockito.when(functionDictionaryIfc.getFunction("SIN")).thenReturn(Mockito.mock(FunctionIfc.class));

        Tokenizer tokenizer = new Tokenizer("SIN(1)", expressionConfiguration);
        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(4, tokens.size());
    }

}