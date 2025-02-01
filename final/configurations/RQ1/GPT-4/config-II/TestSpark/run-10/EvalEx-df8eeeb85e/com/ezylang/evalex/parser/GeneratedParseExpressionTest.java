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
public class GeneratedParseExpressionTest {

    @Mock
    private ExpressionConfiguration configuration;

    @Test
    public void parseExpressionTest() throws ParseException {
        String expression = "(1+2)*3/4";
        Tokenizer tokenizer = new Tokenizer(expression, configuration);

        List<Token> result = tokenizer.parse();

        assertEquals(11, result.size());
        assertEquals("(", result.get(0).getValue());
        assertEquals("1", result.get(1).getValue());
        assertEquals("+", result.get(2).getValue());
        assertEquals("2", result.get(3).getValue());
        assertEquals(")", result.get(4).getValue());
        assertEquals("*", result.get(5).getValue());
        assertEquals("3", result.get(6).getValue());
        assertEquals("/", result.get(7).getValue());
        assertEquals("4", result.get(8).getValue());
    }

}