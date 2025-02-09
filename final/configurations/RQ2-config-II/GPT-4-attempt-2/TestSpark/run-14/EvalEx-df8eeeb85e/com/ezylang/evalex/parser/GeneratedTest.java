package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedTest {

    @Test
    public void parseEmptyExpressionTest() throws ParseException {
        ExpressionConfiguration expressionConfiguration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("", expressionConfiguration);
        tokenizer.parse();
    }

    @Test
    public void parsesPlusExpression() throws ParseException {
        ExpressionConfiguration expressionConfiguration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("1+1", expressionConfiguration);
        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(3, tokens.size());
    }

    @Test
    public void parsesMinusExpression() throws ParseException {
        ExpressionConfiguration expressionConfiguration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("3-2", expressionConfiguration);
        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(3, tokens.size());
    }

    @Test
    public void parseUnknownFunctionExpressionTest() throws ParseException {
        ExpressionConfiguration expressionConfiguration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("UNKNOWN(1)", expressionConfiguration);
        tokenizer.parse();
    }

    @Test
    public void parseSinFunctionExpressionTest() throws ParseException {
        ExpressionConfiguration expressionConfiguration = Mockito.mock(ExpressionConfiguration.class);
        FunctionDictionaryIfc functionDictionaryIfc = Mockito.mock(FunctionDictionaryIfc.class);
        Mockito.when(expressionConfiguration.getFunctionDictionary()).thenReturn(functionDictionaryIfc);
        Mockito.when(functionDictionaryIfc.getFunction("SIN")).thenReturn(Mockito.mock(FunctionIfc.class));

        Tokenizer tokenizer = new Tokenizer("SIN(1)", expressionConfiguration);
        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(4, tokens.size());
    }

    @Test
    public void parseStringLiteralWithoutClosingQuoteTest() throws ParseException {
        ExpressionConfiguration expressionConfiguration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("'stringLiteral", expressionConfiguration);
        tokenizer.parseStringLiteral();
    }

    @Test
    public void parseStringLiteralWithClosingQuoteTest() throws ParseException {
        ExpressionConfiguration expressionConfiguration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("'stringLiteral'", expressionConfiguration);
        Token token = tokenizer.parseStringLiteral();
        Assert.assertEquals(TokenType.STRINGPARAM, token.type);
        Assert.assertEquals("stringLiteral", token.surface);
    }

}