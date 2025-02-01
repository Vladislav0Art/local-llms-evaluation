package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.parser.Token.TokenType;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void parseNumberLiteralTest() {
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("5.5e++", config);
        tokenizer.parse();
    }

    @Test
    public void parseTest() {
        OperatorDictionaryIfc operatorDictionary = Mockito.mock(OperatorDictionaryIfc.class);
        OperatorIfc mockOperator = Mockito.mock(OperatorIfc.class);
        when(operatorDictionary.hasInfixOperator("*")).thenReturn(true);
        when(operatorDictionary.getInfixOperator("*")).thenReturn(mockOperator);

        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        when(config.isImplicitMultiplicationAllowed()).thenReturn(true);
        when(config.getOperatorDictionary()).thenReturn(operatorDictionary);

        Tokenizer tokenizer = new Tokenizer("5(5)", config);
        List<Token> result = tokenizer.parse();

        assertEquals(4, result.size());
        assertEquals(TokenType.NUMBER_LITERAL, result.get(0).getType());
        assertEquals(TokenType.INFIX_OPERATOR, result.get(1).getType());
        assertEquals(TokenType.BRACE_OPEN, result.get(2).getType());
        assertEquals(TokenType.NUMBER_LITERAL, result.get(3).getType());
    }

    @Test
    public void parseMissingOperatorTest() {
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        when(config.isImplicitMultiplicationAllowed()).thenReturn(false);

        Tokenizer tokenizer = new Tokenizer("5(5)", config);
        tokenizer.parse();
    }

    @Test
    public void parseFunctionTest() {
        FunctionDictionaryIfc functionDictionary = Mockito.mock(FunctionDictionaryIfc.class);
        when(functionDictionary.hasFunction("test")).thenReturn(true);
        when(functionDictionary.getFunction("test")).thenReturn(Mockito.mock(FunctionIfc.class));

        OperatorDictionaryIfc operatorDictionary = Mockito.mock(OperatorDictionaryIfc.class);
        when(operatorDictionary.hasInfixOperator("test")).thenReturn(true);

        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        when(config.getFunctionDictionary()).thenReturn(functionDictionary);
        when(config.getOperatorDictionary()).thenReturn(operatorDictionary);

        Tokenizer tokenizer = new Tokenizer("test()", config);
        tokenizer.parse();
    }

    @Test
    public void parseStringLiteralTest() {
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("\"test", config);
        tokenizer.parse();
    }

    @Test
    public void parseArrayOpenTest() {
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        when(config.isArraysAllowed()).thenReturn(true);

        Tokenizer tokenizer = new Tokenizer("[5]", config);
        List<Token> result = tokenizer.parse();

        assertEquals(3, result.size());
        assertEquals(TokenType.ARRAY_OPEN, result.get(0).getType());
        assertEquals(TokenType.NUMBER_LITERAL, result.get(1).getType());
        assertEquals(TokenType.ARRAY_CLOSE, result.get(2).getType());
    }

}