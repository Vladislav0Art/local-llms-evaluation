package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionary;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionary;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.Random;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParsePrefixOperatorTest {

    @Mock
    private ExpressionConfiguration mockConfig;

    @Mock
    private OperatorDictionaryIfc mockOperatorDict;

    @Mock
    private FunctionDictionaryIfc mockFuncDict;

    @Mock
    private OperatorIfc mockOperator;

    @Mock
    private FunctionIfc mockFunction;

    @Test
    public void parsePrefixOperatorTest() throws ParseException {
        when(mockOperatorDict.hasPrefixOperator("+")).thenReturn(true);
        when(mockOperatorDict.getPrefixOperator("+")).thenReturn(mockOperator);
        when(mockConfig.getOperatorDictionary()).thenReturn(mockOperatorDict);
        when(mockConfig.getFunctionDictionary()).thenReturn(mockFuncDict);
        Tokenizer testee = new Tokenizer("++", mockConfig);
        assertEquals(testee.parse().get(0).getType(), Token.TokenType.PREFIX_OPERATOR);
    }

}