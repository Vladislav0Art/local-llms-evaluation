package com.ezylang.evalex.parser;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseStringLiteral_ParseExceptionTest {

    @Test
    public void parseStringLiteral_ParseExceptionTest() throws ParseException {
        String expressionString = "\"string";
        ExpressionConfiguration configuration = new ExpressionConfiguration(new OperatorDictionaryIfc() {
        },
                new FunctionDictionaryIfc() {
                }, 1, true);
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        tokenizer.parseStringLiteral();
    }

}