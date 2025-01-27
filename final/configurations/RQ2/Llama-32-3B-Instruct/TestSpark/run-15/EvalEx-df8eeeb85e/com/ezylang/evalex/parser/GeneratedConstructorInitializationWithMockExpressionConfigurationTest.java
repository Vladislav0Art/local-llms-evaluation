package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedConstructorInitializationWithMockExpressionConfigurationTest {

    @Test
    public void constructorInitializationWithMockExpressionConfigurationTest() {
        String expressionString = "expression_string";
        ExpressionConfiguration configuration = mock(ExpressionConfiguration.class);
        when(configuration.getFunctionDictionary()).thenReturn(new FunctionDictionaryIfc());
        when(configuration.getOperatorDictionary()).thenReturn(new OperatorDictionaryIfc());
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        assertNotNull(tokenizer);
    }

}