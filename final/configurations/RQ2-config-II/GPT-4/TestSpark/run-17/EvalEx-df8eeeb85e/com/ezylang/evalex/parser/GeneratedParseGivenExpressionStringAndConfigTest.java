package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedParseGivenExpressionStringAndConfigTest {

    @Test
    public void parseGivenExpressionStringAndConfigTest() throws ParseException {
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        FunctionIfc mockFunction = Mockito.mock(FunctionIfc.class);
        OperatorIfc mockOperator = Mockito.mock(OperatorIfc.class);

        when(mockConfig.getFunction("sin")).thenReturn(mockFunction);
        when(mockConfig.getOperator("*")).thenReturn(mockOperator);

        String expressionString = "sin(30)*2";
        Tokenizer tokenizer = new Tokenizer(expressionString, mockConfig);
        List<Token> tokens = tokenizer.parse();

        assertFalse("Tokens should not be empty", tokens.isEmpty());
        assertEquals("Number of tokens should be 6", 6, tokens.size());
    }

}