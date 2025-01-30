package com.ezylang.evalex.parser;

import org.junit.Assert;
import org.junit.Test;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.config.FunctionDictionaryIfc;

import java.util.Collections;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedParseMissingOperatorInExpressionTest {

    @Test
    public void parseMissingOperatorInExpressionTest() throws ParseException {
        ExpressionConfiguration configuration = setupMockExpressionConfiguration();
        when(configuration.isImplicitMultiplicationAllowed()).thenReturn(false);

        Tokenizer tokenizer = new Tokenizer("1(2)", configuration);

        try {
            tokenizer.parse();
            Assert.fail();
        } catch (ParseException e) {
            Assert.assertTrue(e.getMessage().contains("Missing operator"));
        }
    }

    private ExpressionConfiguration setupMockExpressionConfiguration() {
        OperatorDictionaryIfc operatorDictionary = mock(OperatorDictionaryIfc.class);
        when(operatorDictionary.hasInfixOperator("+")).thenReturn(true);
        when(operatorDictionary.hasInfixOperator("*")).thenReturn(true);

        FunctionDictionaryIfc functionDictionary = mock(FunctionDictionaryIfc.class);

        ExpressionConfiguration configuration = mock(ExpressionConfiguration.class);
        when(configuration.getOperatorDictionary()).thenReturn(operatorDictionary);
        when(configuration.getFunctionDictionary()).thenReturn(functionDictionary);

        return configuration;
    }

}