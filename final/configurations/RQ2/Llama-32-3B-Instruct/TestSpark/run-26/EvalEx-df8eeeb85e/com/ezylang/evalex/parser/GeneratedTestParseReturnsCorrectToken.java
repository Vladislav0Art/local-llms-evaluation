package com.ezylang.evalex.parser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Function;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.lang.reflect.Method;

public class GeneratedTestParseReturnsCorrectToken {

    @Test
    public void testParseReturnsCorrectToken() {
        String expression = "sin(x)";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        when(configuration.getFunctionDictionaryIfc()).thenReturn(new FunctionDictionaryIfc());
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(3, tokens.size());
    }

}