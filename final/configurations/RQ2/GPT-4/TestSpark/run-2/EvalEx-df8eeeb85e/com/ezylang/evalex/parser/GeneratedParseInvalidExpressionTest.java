package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseInvalidExpressionTest {

    @Mock
    ExpressionConfiguration configuration;

    @Test
    public void parseInvalidExpressionTest() throws ParseException {
        when(configuration.getExpressionString()).thenReturn("2+");
        Tokenizer tokenizer = new Tokenizer(configuration.getExpressionString(), configuration);
        tokenizer.parse();
    }

}