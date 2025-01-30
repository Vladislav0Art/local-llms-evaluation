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

public class GeneratedParseInfixExpressionTest {

    @Test
    public void parseInfixExpressionTest() throws Exception {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        OperatorDictionaryIfc opDic = Mockito.mock(OperatorDictionaryIfc.class);
        FunctionDictionaryIfc funcDic = Mockito.mock(FunctionDictionaryIfc.class);

        when(configuration.getOperatorDictionary()).thenReturn(opDic);
        when(configuration.getFunctionDictionary()).thenReturn(funcDic);
        when(opDic.hasInfixOperator("+")).thenReturn(true);

        Tokenizer tokenizer = new Tokenizer("1+1", configuration);
        List<Token> tokens = tokenizer.parse();

        Assert.assertEquals(3, tokens.size());
        Assert.assertEquals("1", tokens.get(0).getValue());
        Assert.assertEquals("+", tokens.get(1).getValue());
        Assert.assertEquals("1", tokens.get(2).getValue());
    }

}