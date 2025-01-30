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

public class GeneratedParseInvalidExpressionTest {

    @Test
    public void parseInvalidExpressionTest() throws ParseException {
        ExpressionConfiguration configuration = mock(ExpressionConfiguration.class);

        Tokenizer tokenizer = new Tokenizer("@", configuration);
        tokenizer.parse();
    }

}