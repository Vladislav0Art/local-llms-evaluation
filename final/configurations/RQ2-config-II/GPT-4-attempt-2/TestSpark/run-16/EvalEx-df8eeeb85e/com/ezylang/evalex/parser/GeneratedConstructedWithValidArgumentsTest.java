package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.*;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedConstructedWithValidArgumentsTest {

    @Test
    public void constructedWithValidArgumentsTest() {
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        try {
            Tokenizer tokenizer = new Tokenizer("1+1", config);
            assert tokenizer != null;
        } catch (Exception e) {
            assert false;
        }
    }

}