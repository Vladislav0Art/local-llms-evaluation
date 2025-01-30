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

public class GeneratedParseInvalidTokensTest {

    @Test
    public void parseInvalidTokensTest() throws Exception {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        OperatorDictionaryIfc opDic = Mockito.mock(OperatorDictionaryIfc.class);

        when(configuration.getOperatorDictionary()).thenReturn(opDic);

        Tokenizer tokenizer = new Tokenizer("1$$1", configuration);
        tokenizer.parse();
    }

}