package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.parser.Token.TokenType;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedParseMissingOperatorTest {

    @Test
    public void parseMissingOperatorTest() {
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        when(config.isImplicitMultiplicationAllowed()).thenReturn(false);

        Tokenizer tokenizer = new Tokenizer("5(5)", config);
        tokenizer.parse();
    }

}