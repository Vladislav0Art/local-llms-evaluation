package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class GeneratedParseValidFunctionTest {

    @Test
    public void parseValidFunctionTest() throws ParseException {
        FunctionDictionaryIfc functionDictionary = Mockito.mock(FunctionDictionaryIfc.class);
        Mockito.when(functionDictionary.hasFunction(Mockito.anyString())).thenReturn(true);
        Mockito.when(functionDictionary.getFunction(Mockito.anyString()))
                .thenReturn(Mockito.mock(FunctionIfc.class));
        ExpressionConfiguration configuration =
                new ExpressionConfiguration(functionDictionary);
        Tokenizer tokenizer = new Tokenizer("sin(90)", configuration);

        List<Token> tokens = tokenizer.parse();

        assertEquals(3, tokens.size());
    }

}