package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void parseEmptyStringTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        String exp = "";
        Tokenizer tokenizer = new Tokenizer(exp, configuration);
        List<Token> result = tokenizer.parse();

        assertNotNull(result);
        assertEquals(0, result.size());
    }

    @Test
    public void parseStringLiteralTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        String exp = "\"hello world\"";
        Tokenizer tokenizer = new Tokenizer(exp, configuration);
        List<Token> result = tokenizer.parse();

        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(Token.TokenType.STRING_LITERAL, result.get(0).getType());
    }

    @Test
    public void parseThrowsParseExceptionClosingQuoteTest() throws ParseException {
        thrown.expect(ParseException.class);
        thrown.expectMessage("Closing quote not found");

        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        String exp = "\"hello world";
        Tokenizer tokenizer = new Tokenizer(exp, configuration);
        tokenizer.parse();
    }

    @Test
    public void parseIdentifierTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Mockito.when(configuration.isImplicitMultiplicationAllowed()).thenReturn(true);

        String exp = "hello";

        OperatorDictionaryIfc operatorDictionary = Mockito.mock(OperatorDictionaryIfc.class);
        Mockito.when(operatorDictionary.hasPrefixOperator(Mockito.anyString())).thenReturn(false);
        Mockito.when(operatorDictionary.hasPostfixOperator(Mockito.anyString())).thenReturn(false);
        Mockito.when(operatorDictionary.hasInfixOperator(Mockito.anyString())).thenReturn(false);
        Mockito.when(configuration.getOperatorDictionary()).thenReturn(operatorDictionary);

        Tokenizer tokenizer = new Tokenizer(exp, configuration);
        List<Token> result = tokenizer.parse();

        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(Token.TokenType.VARIABLE_OR_CONSTANT, result.get(0).getType());
    }

    @Test
    public void parseThrowsParseExceptionForUnexpectedTokenAfterInfixOperator() throws ParseException {
        thrown.expect(ParseException.class);
        thrown.expectMessage("Unexpected token after infix operator");

        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Mockito.when(configuration.isImplicitMultiplicationAllowed()).thenReturn(true);
        String exp = "1+%";
        OperatorDictionaryIfc operatorDictionary = Mockito.mock(OperatorDictionaryIfc.class);
        Mockito.when(operatorDictionary.hasInfixOperator(Mockito.anyString())).thenReturn(true);
        Mockito.when(configuration.getOperatorDictionary()).thenReturn(operatorDictionary);
        Tokenizer tokenizer = new Tokenizer(exp, configuration);
        tokenizer.parse();
    }

    @Test
    public void parseThrowsParseExceptionUndefinedOperator() throws ParseException {
        thrown.expect(ParseException.class);
        thrown.expectMessage("Undefined operator '^'");

        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Mockito.when(configuration.isImplicitMultiplicationAllowed()).thenReturn(true);
        String exp = "^";
        OperatorDictionaryIfc operatorDictionary = Mockito.mock(OperatorDictionaryIfc.class);
        Mockito.when(operatorDictionary.hasInfixOperator(Mockito.anyString())).thenReturn(false);
        Mockito.when(configuration.getOperatorDictionary()).thenReturn(operatorDictionary);
        Tokenizer tokenizer = new Tokenizer(exp, configuration);
        tokenizer.parse();
    }

}