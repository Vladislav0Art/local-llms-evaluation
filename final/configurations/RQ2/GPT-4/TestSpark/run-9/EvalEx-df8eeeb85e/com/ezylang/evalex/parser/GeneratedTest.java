package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.parser.Token;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    ExpressionConfiguration configuration;

    @Mock
    FunctionDictionaryIfc functionDictionary;

    @Mock
    OperatorDictionaryIfc operatorDictionary;

    @InjectMocks
    Tokenizer tokenizer;

    @Test
    public void parseTest() throws ParseException {
        String expression = "1+1";
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> tokens = tokenizer.parse();
        assertNotNull(tokens);
        assertTrue(tokens.size() != 0);
    }

    @Test
    public void parseEmptyStringTest() throws ParseException {
        String expression = "";
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        tokenizer.parse();
    }

    @Test
    public void parseStringLiteralNonStringTest() throws ParseException {
        String expression = "1+1";
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        tokenizer.parseStringLiteral();
    }

}