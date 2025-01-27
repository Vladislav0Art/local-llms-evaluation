package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import com.ezylang.evalex.parser.Token.TokenType;

public class GeneratedParse_function {

    @Test
    public void parse_function() {
        FunctionIfc function = mock(FunctionIfc.class);
        OperatorDictionaryIfc operatorDictionary = mock(OperatorDictionaryIfc.class);
        ExpressionConfiguration expressionConfiguration = new ExpressionConfiguration(function, operatorDictionary);

        when(expressionConfiguration.functionDictionary()).thenReturn(function);
        when(expressionConfiguration.operatorDictionary()).thenReturn(operatorDictionary);

        String expressionString = "f(123)";
        List<Token> tokens = new ArrayList<>();
        // assuming parse is a static method, use it directly
        // or create an instance of the class that calls this method and mock it
        when(tokenizer(expressionString).parse()).thenReturn(tokens);

        Tokenizer tokenizer = new Tokenizer(expressionString, expressionConfiguration);
        List<Token> result = tokenizer.parse();
        assertThat(result.get(0).value(), is("f"));
    }

}