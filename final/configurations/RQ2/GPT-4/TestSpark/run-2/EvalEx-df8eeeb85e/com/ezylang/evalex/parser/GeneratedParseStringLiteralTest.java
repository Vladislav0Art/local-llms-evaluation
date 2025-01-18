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
public class GeneratedParseStringLiteralTest {

    @Mock
    ExpressionConfiguration configuration;

    @Test
    public void parseStringLiteralTest() throws ParseException {
        when(configuration.getExpressionString()).thenReturn("\"test\"");
        Tokenizer tokenizer = new Tokenizer(configuration.getExpressionString(), configuration);
        Token token = tokenizer.parseStringLiteral();
        assertEquals("\"test\"", token.toString());
    }

}