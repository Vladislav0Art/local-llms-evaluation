package com.ezylang.evalex.parser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Function;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.lang.reflect.Method;

public class GeneratedTestParseWithEmptyExpression {

    @Test
    public void testParseWithEmptyExpression() {
        String expression = "";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        when(configuration.getFunctionDictionaryIfc()).thenReturn(null);
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> tokens = tokenizer.parse();
        assertTrue(tokens.isEmpty());
    }

}