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

public class GeneratedParseOperatorPrefixTest {

    @Test
    public void parseOperatorPrefixTest() throws ParseException {
        OperatorDictionaryIfc operatorDictionary = Mockito.mock(OperatorDictionaryIfc.class);
        Mockito.when(operatorDictionary.hasPrefixOperator(Mockito.anyString())).thenReturn(true);
        OperatorIfc operator = Mockito.mock(OperatorIfc.class);
        Mockito.when(operatorDictionary.getPrefixOperator(Mockito.anyString())).thenReturn(operator);

        FunctionDictionaryIfc functionDictionary = Mockito.mock(FunctionDictionaryIfc.class);

        ExpressionConfiguration configuration = new ExpressionConfiguration(operatorDictionary, functionDictionary);

        String expression = "--5";
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        Assert.assertEquals(2, tokenizer.parse().size());
    }

}