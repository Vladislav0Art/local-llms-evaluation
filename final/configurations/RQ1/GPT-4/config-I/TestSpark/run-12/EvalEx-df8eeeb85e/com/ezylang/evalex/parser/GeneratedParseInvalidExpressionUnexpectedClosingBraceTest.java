package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.parser.Token.TokenType;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

public class GeneratedParseInvalidExpressionUnexpectedClosingBraceTest {

    @Test
    public void parseInvalidExpressionUnexpectedClosingBraceTest() throws ParseException {
        String expressionString = "3 + 5)";
        ExpressionConfiguration mockConfig = mock(ExpressionConfiguration.class);
        OperatorDictionaryIfc mockOperatorDict = mock(OperatorDictionaryIfc.class);
        when(mockConfig.getOperatorDictionary()).thenReturn(mockOperatorDict);
        when(mockOperatorDict.getInfixOperator(anyString())).thenReturn(mock(OperatorIfc.class));
        Tokenizer tokenizer = new Tokenizer(expressionString, mockConfig);
        List<Token> tokens = tokenizer.parse();
    }

}