package com.ezylang.evalex.parser;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.functions.FunctionIfc;

import java.util.List;

public class GeneratedTokenizerNullConfigurationTest {

    @Test
    public void TokenizerNullConfigurationTest() {
        Tokenizer tokenizer = new Tokenizer("1 + 1", null);
    }

}