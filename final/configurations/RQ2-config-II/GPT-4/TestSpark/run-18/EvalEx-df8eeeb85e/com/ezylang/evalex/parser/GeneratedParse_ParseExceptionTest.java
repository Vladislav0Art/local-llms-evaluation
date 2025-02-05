package com.ezylang.evalex.parser;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParse_ParseExceptionTest {

    @Test
    public void parse_ParseExceptionTest() throws ParseException {
        String expressionString = "2++";
        ExpressionConfiguration configuration = new ExpressionConfiguration(new OperatorDictionaryIfc() {
        },
                new FunctionDictionaryIfc() {
                }, 1, true);
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        tokenizer.parse();
    }

}