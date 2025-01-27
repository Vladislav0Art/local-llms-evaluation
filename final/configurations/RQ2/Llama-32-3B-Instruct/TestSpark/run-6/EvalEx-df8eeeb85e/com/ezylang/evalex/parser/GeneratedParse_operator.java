package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import com.ezylang.evalex.parser.Token.TokenType;

public class GeneratedParse_operator {

    @Test
    public void parse_operator() {
        OperatorIfc operator = mock(OperatorIfc.class);
        FunctionDictionaryIfc functionDictionary = mock(FunctionDictionaryIfc.class);
        ExpressionConfiguration expressionConfiguration = new ExpressionConfiguration(functionDictionary, operator);

        when(expressionConfiguration.functionDictionary()).thenReturn(functionDictionary);
        when(expressionConfiguration.operatorDictionary()).thenReturn(operator);

        String expressionString = "+ 123";
        List<Token> tokens = new ArrayList<>();
        // assuming parse is a static method, use it directly
        // or create an instance of the class that calls this method and mock it
        when(tokenizer(expressionString).parse()).thenReturn(tokens);

        Tokenizer tokenizer = new Tokenizer(expressionString, expressionConfiguration);
        List<Token> result = tokenizer.parse();
        assertThat(result.get(0).value(), is("+"));
    }

}