package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import com.ezylang.evalex.parser.Token.TokenType;

public class GeneratedParse_emptyExpression {

    @Test
    public void parse_emptyExpression() {
        when(expressionConfiguration().functionDictionary()).thenReturn(new FunctionDictionaryIfc());
        when(expressionConfiguration().operatorDictionary()).thenReturn(new OperatorDictionaryIfc());

        List<Token> tokens = new ArrayList<>();
        // assuming expressionString is a static method, use it directly
        // or create an instance of the class that calls this method and mock it
        when(tokenizer(expressionString("")).parse()).thenReturn(tokens);

        Tokenizer tokenizer = new Tokenizer("", expressionConfiguration());
        List<Token> result = tokenizer.parse();
        assertThat(result, is(tokens));
    }

}