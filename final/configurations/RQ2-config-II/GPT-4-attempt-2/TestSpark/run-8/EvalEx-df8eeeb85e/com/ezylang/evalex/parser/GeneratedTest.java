package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void tokenizerInitTest() {
        ExpressionConfiguration config = new ExpressionConfiguration(mock(FunctionDictionaryIfc.class), mock(OperatorDictionaryIfc.class), false);
        Tokenizer tokenizer = new Tokenizer("SampleExpression", config);
        Assert.assertNotNull(tokenizer);
    }

    @Test
    public void parseInvalidExpressionTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration(mock(FunctionDictionaryIfc.class), mock(OperatorDictionaryIfc.class), false);
        Tokenizer tokenizer = new Tokenizer("InvalidExpression", config);
        tokenizer.parse();
    }

    @Test
    public void parseValidExpressionTest() throws ParseException {
        OperatorIfc operator = mock(OperatorIfc.class);
        when(operator.hasHigherPrecedence(null)).thenReturn(true);

        OperatorDictionaryIfc operatorDictionary = mock(OperatorDictionaryIfc.class);
        when(operatorDictionary.getOperator("PLUS")).thenReturn(operator);

        FunctionIfc function = mock(FunctionIfc.class);
        when(function.getName()).thenReturn("FunctionName");

        FunctionDictionaryIfc functionDictionary = mock(FunctionDictionaryIfc.class);
        when(functionDictionary.forName("FunctionName")).thenReturn(function);

        ExpressionConfiguration config = new ExpressionConfiguration(functionDictionary, operatorDictionary, false);
        Tokenizer tokenizer = new Tokenizer("PLUS FunctionName", config);
        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(2, tokens.size());
    }

    @Test
    public void parseStringLiteralInvalidStringTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration(mock(FunctionDictionaryIfc.class), mock(OperatorDictionaryIfc.class), false);
        Tokenizer tokenizer = new Tokenizer("InvalidStringLiteral", config);
        tokenizer.parseStringLiteral();
    }

    @Test
    public void parseStringLiteralValidStringTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration(mock(FunctionDictionaryIfc.class), mock(OperatorDictionaryIfc.class), false);
        Tokenizer tokenizer = new Tokenizer("\"ValidStringLiteral\"", config);
        Token token = tokenizer.parseStringLiteral();
        Assert.assertEquals("ValidStringLiteral", token.surface);
    }

}