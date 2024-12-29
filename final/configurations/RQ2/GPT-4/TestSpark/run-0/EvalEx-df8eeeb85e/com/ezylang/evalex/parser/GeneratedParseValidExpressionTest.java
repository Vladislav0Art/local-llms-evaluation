package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.functions.FunctionIfc;

import java.util.Collections;
import java.util.List;
import java.math.MathContext;
import java.util.function.Supplier;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedParseValidExpressionTest {

    @Test
    public void parseValidExpressionTest() throws ParseException {
        final String expression = "1+1";
        OperatorDictionaryIfc opDic = mock(OperatorDictionaryIfc.class);
        FunctionDictionaryIfc funDic = mock(FunctionDictionaryIfc.class);
        final ExpressionConfiguration config = new ExpressionConfiguration(opDic, funDic, MathContext.DECIMAL32, null, Collections.emptyMap(), false, false, false, 0, 0, false, false);
        final Tokenizer tokenizer = new Tokenizer(expression, config);

        List<Token> tokens = tokenizer.parse();

        Assert.assertNotNull(tokens);
        Assert.assertEquals(3, tokens.size());
    }

}