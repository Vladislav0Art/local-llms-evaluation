package com.ezylang.evalex.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedTestParseMethodReturnsCorrectTokensForValidInput {

    @Mock
    private ExpressionConfiguration configuration;

    @Mock
    private FunctionDictionaryIfc functionDictionary;

    @Mock
    private OperatorDictionaryIfc operatorDictionary;

    private List<Token> tokens;
    private Tokenizer tokenizer;

    public void setup() {
        MockitoAnnotations.initMocks(this);
        when(configuration.getFunctionDictionary()).thenReturn(functionDictionary);
        when(configuration.getOperatorDictionary()).thenReturn(operatorDictionary);

        tokens = new ArrayList<>();
    }

    @Test
    public void testParseMethodReturnsCorrectTokensForValidInput() throws ParseException {
        setup();
        List<Token> expected = Arrays.asList(new Token(TokenType.Ident, "test"));
        when(tokenizer.parse()).thenReturn(expected);
        tokens = expected;
        List<Token> result = tokenizer.parse();
        assertThat(result, is(tokens));
    }

}