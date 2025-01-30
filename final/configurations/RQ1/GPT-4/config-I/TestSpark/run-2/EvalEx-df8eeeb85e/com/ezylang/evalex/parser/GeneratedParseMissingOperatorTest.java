package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseMissingOperatorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void parseMissingOperatorTest() throws ParseException {
        final ExpressionConfiguration configuration = createMockExpressionConfiguration();
        Mockito.when(configuration.isImplicitMultiplicationAllowed()).thenReturn(false);
        final Tokenizer tokenizer = new Tokenizer("1 1", configuration);
        thrown.expect(ParseException.class);
        thrown.expectMessage("Missing operator");
        tokenizer.parse();
    }

    private ExpressionConfiguration createMockExpressionConfiguration() {
        final ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        final OperatorDictionaryIfc operatorDictionaryIfc = Mockito.mock(OperatorDictionaryIfc.class);
        final FunctionDictionaryIfc functionDictionaryIfc = Mockito.mock(FunctionDictionaryIfc.class);
        final OperatorIfc operatorIfc = Mockito.mock(OperatorIfc.class);
        Mockito.when(configuration.getOperatorDictionary()).thenReturn(operatorDictionaryIfc);
        Mockito.when(configuration.getFunctionDictionary()).thenReturn(functionDictionaryIfc);
        Mockito.when(operatorDictionaryIfc.getInfixOperator(Mockito.anyString())).thenReturn(operatorIfc);
        Mockito.when(operatorDictionaryIfc.getPostfixOperator(Mockito.anyString())).thenReturn(operatorIfc);
        Mockito.when(operatorDictionaryIfc.getPrefixOperator(Mockito.anyString())).thenReturn(operatorIfc);
        return configuration;
    }

}