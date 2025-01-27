package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedParseMethodThrowsMockParseExceptionTest {

    @Test
    public void parseMethodThrowsMockParseExceptionTest() throws ParseException {
        String expressionString = "expression_string";
        ExpressionConfiguration configuration = mock(ExpressionConfiguration.class);
        when(configuration.getFunctionDictionary()).thenReturn(new FunctionDictionaryIfc());
        when(configuration.getOperatorDictionary()).thenReturn(new OperatorDictionaryIfc());
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        assertThrows(ParseException.class, () -> tokenizer.parse());
    }

}