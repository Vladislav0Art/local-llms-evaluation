package com.ezylang.evalex.parser;

import org.junit.Test;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.ExpressionConfiguration;

import java.text.ParseException;
import java.util.List;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedParseExceptionScenarioTest {

    @Test
    public void parseExceptionScenarioTest() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        try {
            Tokenizer tokenizer = new Tokenizer("InvalidExpression", config);
            List<Token> tokens = tokenizer.parse();
            fail("Expecting ParseException for invalid expressions");
        } catch (ParseException pe) { /* Expected Exception */ }
    }

}