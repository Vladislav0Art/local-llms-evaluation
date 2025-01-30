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

public class GeneratedConstructTokenizerWithNullExpressionConfigurationTest {

    @Test
    public void constructTokenizerWithNullExpressionConfigurationTest() {
        try {
            new Tokenizer("1+2", null);
            Assert.fail("NullPointerException was not thrown for null expressionConfiguration");
        } catch (NullPointerException e) {
            // Expected behavior
        }
    }

    private ExpressionConfiguration createMockConfig() {
        OperatorDictionaryIfc operatorDictionaryIfc = Mockito.mock(OperatorDictionaryIfc.class);
        FunctionDictionaryIfc functionDictionaryIfc = Mockito.mock(FunctionDictionaryIfc.class);

        Mockito.when(operatorDictionaryIfc.hasInfixOperator("+")).thenReturn(true);
        Mockito.when(operatorDictionaryIfc.getInfixOperator("+")).thenReturn(Mockito.mock(OperatorIfc.class));

        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        Mockito.when(config.getOperatorDictionary()).thenReturn(operatorDictionaryIfc);
        Mockito.when(config.getFunctionDictionary()).thenReturn(functionDictionaryIfc);

        return config;
    }

}