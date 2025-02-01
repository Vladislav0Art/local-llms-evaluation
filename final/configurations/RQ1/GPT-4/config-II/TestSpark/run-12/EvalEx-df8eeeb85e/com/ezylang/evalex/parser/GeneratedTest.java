package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void parseEmptyExpressionTest() throws ParseException {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("", configuration);

        List<Token> tokens = tokenizer.parse();

        assertEquals(0, tokens.size());
    }

    @Test
    public void parseInvalidExpressionTest() throws ParseException {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("1 + 2 )", configuration);
        tokenizer.parse();
    }

    @Test
    public void parseValidExpressionTest() throws ParseException {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("100 + 200", configuration);

        List<Token> tokens = tokenizer.parse();

        assertEquals(3, tokens.size());
    }

    @Test
    public void parseUndefinedFunctionTest() throws ParseException {
        FunctionDictionaryIfc functionDictionary = Mockito.mock(FunctionDictionaryIfc.class);
        Mockito.when(functionDictionary.hasFunction(Mockito.anyString())).thenReturn(false);
        ExpressionConfiguration configuration =
                new ExpressionConfiguration(functionDictionary);
        Tokenizer tokenizer = new Tokenizer("sin(90)", configuration);

        tokenizer.parse();
    }

    @Test
    public void parseValidFunctionTest() throws ParseException {
        FunctionDictionaryIfc functionDictionary = Mockito.mock(FunctionDictionaryIfc.class);
        Mockito.when(functionDictionary.hasFunction(Mockito.anyString())).thenReturn(true);
        Mockito.when(functionDictionary.getFunction(Mockito.anyString()))
                .thenReturn(Mockito.mock(FunctionIfc.class));
        ExpressionConfiguration configuration =
                new ExpressionConfiguration(functionDictionary);
        Tokenizer tokenizer = new Tokenizer("sin(90)", configuration);

        List<Token> tokens = tokenizer.parse();

        assertEquals(3, tokens.size());
    }

    @Test
    public void parseInvalidImplicitMultiplicationTest() throws ParseException {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        configuration.setImplicitMultiplicationAllowed(false);
        Tokenizer tokenizer = new Tokenizer("2(90)", configuration);

        tokenizer.parse();
    }

    @Test
    public void parseValidImplicitMultiplicationTest() throws ParseException {
        OperatorDictionaryIfc operatorDictionary = Mockito.mock(OperatorDictionaryIfc.class);
        Mockito.when(operatorDictionary.hasInfixOperator(Mockito.anyString())).thenReturn(true);
        ExpressionConfiguration configuration =
                new ExpressionConfiguration(operatorDictionary);
        configuration.setImplicitMultiplicationAllowed(true);
        Tokenizer tokenizer = new Tokenizer("2(90)", configuration);

        List<Token> tokens = tokenizer.parse();

        assertEquals(4, tokens.size());
    }

}