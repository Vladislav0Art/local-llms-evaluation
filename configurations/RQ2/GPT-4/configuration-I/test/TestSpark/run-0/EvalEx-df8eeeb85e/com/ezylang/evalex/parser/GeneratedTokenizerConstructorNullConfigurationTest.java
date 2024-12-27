package com.ezylang.evalex.parser;

import org.junit.Test;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.ExpressionConfiguration;

import java.text.ParseException;
import java.util.List;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedTokenizerConstructorNullConfigurationTest {

    @Test
    public void TokenizerConstructorNullConfigurationTest() {
        try {
            Tokenizer tokenizer = new Tokenizer("1+1", null);
            fail("Expecting IllegalArgumentException for null configuration");
        } catch (IllegalArgumentException iae) {
            assertEquals(iae.getMessage(), "Configuration object cannot be null");
        }
    }

}