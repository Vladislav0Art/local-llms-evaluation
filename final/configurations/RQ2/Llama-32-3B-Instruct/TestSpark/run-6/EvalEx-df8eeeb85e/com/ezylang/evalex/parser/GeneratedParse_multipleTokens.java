package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import com.ezylang.evalex.parser.Token.TokenType;

public class GeneratedParse_multipleTokens {

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