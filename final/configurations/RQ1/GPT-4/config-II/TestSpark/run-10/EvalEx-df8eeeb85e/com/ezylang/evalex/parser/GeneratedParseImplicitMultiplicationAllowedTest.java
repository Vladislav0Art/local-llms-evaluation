package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseImplicitMultiplicationAllowedTest {

    @Mock
    private ExpressionConfiguration configuration;

    @Test
    public void parseImplicitMultiplicationAllowedTest() throws ParseException {
        String expression = "2(1+1)";
        when(configuration.isImplicitMultiplicationAllowed()).thenReturn(true);
        Tokenizer tokenizer = new Tokenizer(expression, configuration);

        List<Token> result = tokenizer.parse();

        assertEquals(7, result.size());
        assertEquals("2", result.get(0).getValue());
        assertEquals("*", result.get(1).getValue());
        assertEquals("(", result.get(2).getValue());
        assertEquals("1", result.get(3).getValue());
        assertEquals("+", result.get(4).getValue());
        assertEquals("1", result.get(5).getValue());
        assertEquals(")", result.get(6).getValue());
    }

}