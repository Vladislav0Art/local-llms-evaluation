package com.ezylang.evalex.parser;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.parser.Token.TokenType;
import org.junit.Test;

import java.util.List;

public class GeneratedParseInvalidExpressionTest {

    @Test
    public void parseInvalidExpressionTest() throws ParseException {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        when(config.getOperatorDictionary()).thenReturn(mock(OperatorDictionaryIfc.class));
        when(config.getFunctionDictionary()).thenReturn(mock(FunctionDictionaryIfc.class));
        Tokenizer tokenizer = new Tokenizer("1++1", config);
        tokenizer.parse();
    }

}