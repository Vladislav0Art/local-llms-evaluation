package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseFunctionTest {

    @Mock
    private ExpressionConfiguration mockConfiguration;
    @Mock
    private OperatorDictionaryIfc mockOperatorDictionary;
    @Mock
    private FunctionDictionaryIfc mockFunctionDictionary;
    @Mock
    private FunctionIfc mockFunction;
    @Mock
    private OperatorIfc mockOperator;

    @Test
    public void parseFunctionTest() throws ParseException {
        setupConfig(false, false);
        when(mockFunctionDictionary.hasFunction(anyString())).thenReturn(true);
        when(mockFunctionDictionary.getFunction(anyString())).thenReturn(mockFunction);

        Tokenizer tokenizer = new Tokenizer("function()", mockConfiguration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(3, tokens.size());
    }

}