package com.ezylang.evalex.parser;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParse_NoParseExceptionTest {

    @Test
    public void parse_NoParseExceptionTest() {
        String expressionString = "2+2";
        ExpressionConfiguration configuration = new ExpressionConfiguration(new OperatorDictionaryIfc() {
        },
                new FunctionDictionaryIfc() {
                }, 1, true);
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        try {
            List<Token> tokens = tokenizer.parse();
            assertNotNull(tokens);
        } catch (ParseException e) {
            fail("ParseException should not have been thrown");
        }
    }

}