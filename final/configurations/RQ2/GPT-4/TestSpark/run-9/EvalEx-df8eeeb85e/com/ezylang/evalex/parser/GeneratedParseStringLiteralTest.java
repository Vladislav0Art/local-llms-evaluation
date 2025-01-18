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
public class GeneratedParseStringLiteralTest {

    @Mock
    ExpressionConfiguration configuration;

    @Mock
    FunctionDictionaryIfc functionDictionary;

    @Mock
    OperatorDictionaryIfc operatorDictionary;

    @InjectMocks
    Tokenizer tokenizer;

    @Test
    public void parseStringLiteralTest() throws ParseException {
        String expression = "'abc'";
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        Token token = tokenizer.parseStringLiteral();
        assertNotNull(token);
        assertEquals(Token.TokenType.CHARACTER, token.getType());
    }

}