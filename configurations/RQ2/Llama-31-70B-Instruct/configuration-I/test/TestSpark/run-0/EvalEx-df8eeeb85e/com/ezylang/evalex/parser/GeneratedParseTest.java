package com.ezylang.evalex.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseTest {

    @Mock
    private ExpressionConfiguration configuration;

    @Test
    public void parseTest() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("expressionString", configuration);
        List<Token> expectedTokens = new ArrayList<>();
        when(configuration.getOperators()).thenReturn(expectedTokens);
        List<Token> actualTokens = tokenizer.parse();
        assertEquals(expectedTokens, actualTokens);
    }

}