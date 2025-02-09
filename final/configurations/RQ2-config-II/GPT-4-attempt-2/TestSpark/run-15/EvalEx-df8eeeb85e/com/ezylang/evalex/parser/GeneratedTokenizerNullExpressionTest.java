package com.ezylang.evalex.parser;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.functions.FunctionIfc;

import java.util.List;

public class GeneratedTokenizerNullExpressionTest {

    @Test
    public void TokenizerNullExpressionTest() {
        ExpressionConfiguration configuration = mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(null, configuration);
    }

}