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

import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyString;

import org.mockito.InjectMocks;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParse_NullInputTest {

    @Test
    public void parse_NullInputTest() throws ParseException {
        Tokenizer tokenizer = new Tokenizer(null, new ExpressionConfiguration());
        assertThrows(ParseException.class, () -> tokenizer.parse());
    }

}