package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseWithValidExpressionTest {

    @Test
    public void parseWithValidExpressionTest() throws ParseException {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        when(configuration.getFunctionDictionary()).thenReturn(new FunctionDictionaryIfc());
        when(configuration.getOperatorDictionary()).thenReturn(new OperatorDictionaryIfc());
        Tokenizer tokenizer = new Tokenizer("expression", configuration);
        List<Token> tokens = tokenizer.parse();
        // Add assertions for tokens
    }

}