package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.List;

public class GeneratedParseFunctionReturnsCorrectToken {

    @Test
    public void parseFunctionReturnsCorrectToken() {
        String expressionString = "sin(x)";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        OperatorDictionaryIfc operatorDictionaryIfc = Mockito.mock(OperatorDictionaryIfc.class);
        when(mockOperatorDictionaryIfc.get("sin")).thenReturn(new FunctionIfc());
        List<Token> tokens = tokenizer.parse();
        assertThat(tokens.size(), is(2));
    }

}