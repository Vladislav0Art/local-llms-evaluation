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

public class GeneratedParseThrowsParseExceptionUndefinedOperator {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

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