package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class GeneratedParseInvalidImplicitMultiplicationTest {

    @Test
    public void parseInvalidImplicitMultiplicationTest() throws ParseException {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        configuration.setImplicitMultiplicationAllowed(false);
        Tokenizer tokenizer = new Tokenizer("2(90)", configuration);

        tokenizer.parse();
    }

}