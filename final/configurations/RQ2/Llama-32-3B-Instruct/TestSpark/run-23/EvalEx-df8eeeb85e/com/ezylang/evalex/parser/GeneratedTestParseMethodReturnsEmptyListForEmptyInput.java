package com.ezylang.evalex.parser;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedTestParseMethodReturnsEmptyListForEmptyInput {

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
    public void testParseMethodReturnsEmptyListForEmptyInput() throws ParseException {
        setup();
        when(tokenizer.parse()).thenReturn(new ArrayList<>());
        List<Token> result = tokenizer.parse();
        assertThat(result, emptyList());
    }

}