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
public class GeneratedParseEmptyExpressionTest {

    @Mock
    ExpressionConfiguration configuration;

    @Test
    public void parseEmptyExpressionTest() throws ParseException {
        when(configuration.getExpressionString()).thenReturn("");
        Tokenizer tokenizer = new Tokenizer(configuration.getExpressionString(), configuration);
        List<Token> tokenList = tokenizer.parse();
        assertEquals(0, tokenList.size());
    }

}