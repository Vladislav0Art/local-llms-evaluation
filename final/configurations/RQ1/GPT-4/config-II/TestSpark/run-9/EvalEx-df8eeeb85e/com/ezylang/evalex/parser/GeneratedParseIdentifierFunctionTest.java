package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.util.Optional;

public class GeneratedParseIdentifierFunctionTest {

    @Test
    public void parseIdentifierFunctionTest() throws ParseException {
        OperatorDictionaryIfc operatorDictionary = Mockito.mock(OperatorDictionaryIfc.class);
        FunctionIfc function = Mockito.mock(FunctionIfc.class);
        Mockito.when(operatorDictionary.hasPrefixOperator(Mockito.anyString())).thenReturn(false);

        FunctionDictionaryIfc functionDictionary = Mockito.mock(FunctionDictionaryIfc.class);
        Mockito.when(functionDictionary.hasFunction(Mockito.anyString())).thenReturn(true);
        Mockito.when(functionDictionary.getFunction(Mockito.anyString())).thenReturn(function);

        ExpressionConfiguration configuration = new ExpressionConfiguration(operatorDictionary, functionDictionary);

        String expression = "sin(2)";
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        Assert.assertEquals(4, tokenizer.parse().size());
    }

}