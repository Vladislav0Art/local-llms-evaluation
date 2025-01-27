package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import com.ezylang.evalex.parser.Token.TokenType;

public class GeneratedTest {

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

    @Test
    public void parse_singleNumber() {
        when(expressionConfiguration().functionDictionary()).thenReturn(new FunctionDictionaryIfc());
        when(expressionConfiguration().operatorDictionary()).thenReturn(new OperatorDictionaryIfc());

        String expressionString = "123";
        List<Token> tokens = new ArrayList<>();
        // assuming parse is a static method, use it directly
        // or create an instance of the class that calls this method and mock it
        when(tokenizer(expressionString).parse()).thenReturn(tokens);

        Tokenizer tokenizer = new Tokenizer(expressionString, expressionConfiguration());
        List<Token> result = tokenizer.parse();
        assertThat(result.get(0).value(), is(123));
    }

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

    @Test
    public void parse_multipleTokens() {
        String expressionString = "f(123)";
        List<Token> tokens = new ArrayList<>();
        // assuming parse is a static method, use it directly
        // or create an instance of the class that calls this method and mock it
        when(tokenizer(expressionString).parse()).thenReturn(tokens);

        Tokenizer tokenizer = new Tokenizer(expressionString, expressionConfiguration());
        List<Token> result = tokenizer.parse();
        assertThat(result.get(0).value(), is("f"));
        assertThat(result.get(1).value(), is("("));
        assertThat(result.get(2).value(), is("123"));
        assertThat(result.get(3).value(), is(")"));
    }

    private ExpressionConfiguration expressionConfiguration() {
        return new ExpressionConfiguration();
    }

    public Tokenizer tokenizer(String expressionString) {
        // assuming the class has a static method or an instance method
        // that can be mocked, use it directly or create an instance and mock it
        // here we assume it's a simple static method
        return new Tokenizer(expressionString);
    }

}