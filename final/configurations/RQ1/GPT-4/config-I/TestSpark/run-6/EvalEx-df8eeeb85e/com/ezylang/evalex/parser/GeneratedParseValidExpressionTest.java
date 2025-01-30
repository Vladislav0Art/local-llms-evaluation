package com.ezylang.evalex.parser;

import org.junit.Assert;
import org.junit.Test;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.config.FunctionDictionaryIfc;

import java.util.Collections;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedParseValidExpressionTest {

    @Test
    public void parseValidExpressionTest() throws ParseException {
        ExpressionConfiguration configuration = setupMockExpressionConfiguration();

        Tokenizer tokenizer = new Tokenizer("1+2*3", configuration);
        Assert.assertEquals(5, tokenizer.parse().size());
    }

}