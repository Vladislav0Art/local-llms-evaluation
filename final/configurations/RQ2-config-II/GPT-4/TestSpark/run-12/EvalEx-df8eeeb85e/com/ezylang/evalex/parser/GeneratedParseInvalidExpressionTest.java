package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedParseInvalidExpressionTest {

    @Test
    public void parseInvalidExpressionTest() throws ParseException {
        String invalidExpressionString = "3+*4";
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);

        Tokenizer tokenizer = new Tokenizer(invalidExpressionString, config);
        tokenizer.parse();
    }

}