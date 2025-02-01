package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.parser.Token.TokenType;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedParseFunctionTest {

    @Test
    public void parseFunctionTest() {
        FunctionDictionaryIfc functionDictionary = Mockito.mock(FunctionDictionaryIfc.class);
        when(functionDictionary.hasFunction("test")).thenReturn(true);
        when(functionDictionary.getFunction("test")).thenReturn(Mockito.mock(FunctionIfc.class));

        OperatorDictionaryIfc operatorDictionary = Mockito.mock(OperatorDictionaryIfc.class);
        when(operatorDictionary.hasInfixOperator("test")).thenReturn(true);

        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        when(config.getFunctionDictionary()).thenReturn(functionDictionary);
        when(config.getOperatorDictionary()).thenReturn(operatorDictionary);

        Tokenizer tokenizer = new Tokenizer("test()", config);
        tokenizer.parse();
    }

}