package com.ezylang.evalex.parser;

import org.junit.Test;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.ExpressionConfiguration;

import java.text.ParseException;
import java.util.List;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedTokenizerConstructorNullExpressionStringTest {

    @Test
    public void TokenizerConstructorNullExpressionStringTest() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        try {
            Tokenizer tokenizer = new Tokenizer(null, config);
            fail("Expecting IllegalArgumentException for null expression string");
        } catch (IllegalArgumentException iae) {
            assertEquals(iae.getMessage(), "Expression string cannot be null");
        }
    }

}