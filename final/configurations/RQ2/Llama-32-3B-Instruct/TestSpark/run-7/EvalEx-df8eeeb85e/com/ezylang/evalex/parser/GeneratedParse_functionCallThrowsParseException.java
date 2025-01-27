package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;

import java.util.ArrayList;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParse_functionCallThrowsParseException {

    @Mock
    private ExpressionConfiguration configuration;

    @Test
    public void parse_functionCallThrowsParseException() {
        Tokenizer tokenizer = new Tokenizer("function(token)", configuration);
        try {
            tokenizer.parse();
            fail("ParseException expected");
        } catch (ParseException e) {
            // arrange, act and assert
        }
    }

}