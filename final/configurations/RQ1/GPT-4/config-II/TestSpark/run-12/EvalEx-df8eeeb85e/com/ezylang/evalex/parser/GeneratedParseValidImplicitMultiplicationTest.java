package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class GeneratedParseValidImplicitMultiplicationTest {

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