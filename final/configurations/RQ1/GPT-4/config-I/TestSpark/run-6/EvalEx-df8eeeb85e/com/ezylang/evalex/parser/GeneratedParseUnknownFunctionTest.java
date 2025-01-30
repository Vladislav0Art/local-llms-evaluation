package com.ezylang.evalex.parser;

import org.junit.Assert;
import org.junit.Test;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.operators.OperatorDictionary;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.functions.FunctionDictionary;

import java.util.Arrays;
import java.util.Collections;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedParseUnknownFunctionTest {

    @Test
    public void parseUnknownFunctionTest() throws ParseException {
        ExpressionConfiguration configuration = setupMockExpressionConfiguration();

        Tokenizer tokenizer = new Tokenizer("unknownFunction(1)", configuration);
        try {
            tokenizer.parse();
            Assert.fail();
        } catch (ParseException e) {
            Assert.assertTrue(e.getMessage().contains("Undefined function 'unknownFunction'"));
        }

    }

    private ExpressionConfiguration setupMockExpressionConfiguration() {
        OperatorDictionary operatorDictionary = mock(OperatorDictionary.class);
        when(operatorDictionary.hasInfixOperator("+")).thenReturn(true);
        when(operatorDictionary.hasInfixOperator("*")).thenReturn(true);

        FunctionDictionary functionDictionary = mock(FunctionDictionary.class);

        ExpressionConfiguration configuration = mock(ExpressionConfiguration.class);
        when(configuration.getOperatorDictionary()).thenReturn(operatorDictionary);
        when(configuration.getFunctionDictionary()).thenReturn(functionDictionary);

        return configuration;
    }

}