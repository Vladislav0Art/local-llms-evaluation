package com.ezylang.evalex.parser;

import com.ezylang.evalex.ExpressionConfiguration;
import com.ezylang.evalex.ParseException;
import com.ezylang.evalex.Token;
import com.ezylang.evalex.Tokenizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.mockito.Mock;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseStringLiteral_EmptyStringTest {

    @Test
    public void parseStringLiteral_EmptyStringTest() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("\"\"", new ExpressionConfiguration());
        Token result = tokenizer.parseStringLiteral();
        assertEquals("", result.getValue());
    }

}