package com.ezylang.evalex.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseStringLiteralTest {

    @Mock
    private ExpressionConfiguration configuration;

    @Test
    public void parseStringLiteralTest() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("expressionString", configuration);
        Token expectedToken = new Token("expectedToken");
        when(configuration.getOperators()).thenReturn(expectedToken);
        Token actualToken = tokenizer.parseStringLiteral();
        assertEquals(expectedToken, actualToken);
    }

}