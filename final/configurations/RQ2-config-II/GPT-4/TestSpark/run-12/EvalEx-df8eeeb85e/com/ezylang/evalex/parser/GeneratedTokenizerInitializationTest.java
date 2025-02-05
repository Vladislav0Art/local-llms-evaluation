package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTokenizerInitializationTest {

    @Test
    public void tokenizerInitializationTest() {
        String expressionString = "3+4";
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);

        Tokenizer tokenizer = new Tokenizer(expressionString, config);

        assertNotNull(tokenizer);
    }

}