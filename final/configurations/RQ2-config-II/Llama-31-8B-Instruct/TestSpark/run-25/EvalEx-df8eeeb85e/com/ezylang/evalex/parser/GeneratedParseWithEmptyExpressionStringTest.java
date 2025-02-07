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

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseWithEmptyExpressionStringTest {

    @InjectMocks
    private Tokenizer tokenizer;

    @Test
    public void parseWithEmptyExpressionStringTest() {
        tokenizer = new Tokenizer("", mock(ExpressionConfiguration.class));
        try {
            tokenizer.parse();
            fail("Expected ParseException");
        } catch (ParseException e) {
            // Expected
        }
    }

}