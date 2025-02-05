package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedTokenizerConstructorNullConfigTest {

    @Test
    public void tokenizerConstructorNullConfigTest() {
        new Tokenizer("1+2", null);
    }

}