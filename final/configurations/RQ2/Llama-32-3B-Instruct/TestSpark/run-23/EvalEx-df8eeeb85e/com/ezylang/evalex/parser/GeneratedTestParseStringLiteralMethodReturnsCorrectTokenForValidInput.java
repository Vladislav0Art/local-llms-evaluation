package com.ezylang.evalex.parser;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedTestParseStringLiteralMethodReturnsCorrectTokenForValidInput {

    @Mock
    private ExpressionConfiguration configuration;

    @Mock
    private FunctionDictionaryIfc functionDictionary;

    @Mock
    private OperatorDictionaryIfc operatorDictionary;

    private List<Token> tokens;
    private Tokenizer tokenizer;

    public void setup() {
        when(configuration.getFunctionDictionary()).thenReturn(functionDictionary);
        when(configuration.getOperatorDictionary()).thenReturn(operatorDictionary);

        tokens = new ArrayList<>();
    }

    @Test
    public void testParseStringLiteralMethodReturnsCorrectTokenForValidInput() throws ParseException {
        setup();
        Token token = new Token(1);
        when(tokenizer.parse()).thenReturn(Arrays.asList(token));
        Token result = tokenizer.parseStringLiteral();
        assertEquals(1, result.getTypeNumber());
    }

}