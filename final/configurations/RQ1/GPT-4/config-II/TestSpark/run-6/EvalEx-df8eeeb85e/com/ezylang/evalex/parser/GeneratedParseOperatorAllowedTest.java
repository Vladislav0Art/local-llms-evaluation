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
public class GeneratedParseOperatorAllowedTest {

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
    public void parseOperatorAllowedTest() throws ParseException {
        setupConfig(false, false);
        when(mockOperatorDictionary.hasInfixOperator(anyString())).thenReturn(true);
        when(mockOperatorDictionary.getInfixOperator(anyString())).thenReturn(mockOperator);

        Tokenizer tokenizer = new Tokenizer("(1)", mockConfiguration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(3, tokens.size());
    }

}