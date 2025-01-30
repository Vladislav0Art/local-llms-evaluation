package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Mockito.when;

public class GeneratedParseEmptyExpressionTest {

    @Test
    public void parseEmptyExpressionTest() throws Exception {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        when(configuration.isImplicitMultiplicationAllowed()).thenReturn(true);

        Tokenizer tokenizer = new Tokenizer("", configuration);
        List<Token> tokens = tokenizer.parse();
        Assert.assertTrue(tokens.isEmpty());
    }

}