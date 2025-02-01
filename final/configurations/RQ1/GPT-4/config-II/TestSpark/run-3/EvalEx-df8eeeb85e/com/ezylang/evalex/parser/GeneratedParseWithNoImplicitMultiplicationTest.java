package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedParseWithNoImplicitMultiplicationTest {

    @Test
    public void parseWithNoImplicitMultiplicationTest() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        configuration.setImplicitMultiplicationAllowed(false);
        Tokenizer tokenizer = new Tokenizer("3(5)", configuration);
        try {
            tokenizer.parse();
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
        }
    }

}