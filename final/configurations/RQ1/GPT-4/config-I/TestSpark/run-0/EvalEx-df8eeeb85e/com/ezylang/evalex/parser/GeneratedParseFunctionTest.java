package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.functions.Function;
import com.ezylang.evalex.functions.FunctionIfc;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeneratedParseFunctionTest {

    @Test
    public void parseFunctionTest() throws ParseException {
        ExpressionConfiguration mockConfiguration = Mockito.mock(ExpressionConfiguration.class);
        FunctionDictionaryIfc functionDictionary = Mockito.mock(FunctionDictionaryIfc.class);
        Mockito.when(mockConfiguration.getFunctionDictionary()).thenReturn(functionDictionary);
        Mockito.when(functionDictionary.hasFunction("sqrt")).thenReturn(true);
        Mockito.when(functionDictionary.getFunction("sqrt")).thenReturn(new Function("sqrt", 1));
        Tokenizer tokenizer = new Tokenizer("sqrt(4)", mockConfiguration);
        List<Token> expected = Collections.singletonList(new Token(0, "sqrt", Token.TokenType.FUNCTION));
        Assert.assertEquals(expected, tokenizer.parse());
    }

}