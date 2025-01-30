package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedParseValidFunctionTest {

    @Test
    public void parseValidFunctionTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        OperatorDictionaryIfc operatorDictionary = Mockito.mock(OperatorDictionaryIfc.class);
        FunctionDictionaryIfc functionDictionary = Mockito.mock(FunctionDictionaryIfc.class);

        FunctionIfc function = Mockito.mock(FunctionIfc.class);
        Mockito.when(functionDictionary.hasFunction("func")).thenReturn(true);
        Mockito.when(functionDictionary.getFunction("func")).thenReturn(function);

        Mockito.when(configuration.getOperatorDictionary()).thenReturn(operatorDictionary);
        Mockito.when(configuration.getFunctionDictionary()).thenReturn(functionDictionary);

        Tokenizer tokenizer = new Tokenizer("func(4)", configuration);
        List<Token> tokens = tokenizer.parse();

        assertEquals(tokens.size(), 3);
        assertEquals(tokens.get(0).getType(), Token.TokenType.FUNCTION);
    }

}