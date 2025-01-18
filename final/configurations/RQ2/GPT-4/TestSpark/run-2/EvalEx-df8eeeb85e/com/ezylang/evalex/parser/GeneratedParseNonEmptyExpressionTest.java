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
public class GeneratedParseNonEmptyExpressionTest {

    @Mock
    ExpressionConfiguration configuration;

    @Test
    public void parseNonEmptyExpressionTest() throws ParseException {
        when(configuration.getExpressionString()).thenReturn("2+2");
        Tokenizer tokenizer = new Tokenizer(configuration.getExpressionString(), configuration);
        List<Token> tokenList = tokenizer.parse();
        assertTrue(tokenList.size() > 0);
    }

}