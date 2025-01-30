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

public class GeneratedParseInvalidInfixTest {

    @Test
    public void parseInvalidInfixTest() throws Exception {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        OperatorDictionaryIfc opDic = Mockito.mock(OperatorDictionaryIfc.class);

        when(configuration.getOperatorDictionary()).thenReturn(opDic);
        when(opDic.hasInfixOperator("+")).thenReturn(true);

        Tokenizer tokenizer = new Tokenizer("1+", configuration);
        tokenizer.parse();
    }

}