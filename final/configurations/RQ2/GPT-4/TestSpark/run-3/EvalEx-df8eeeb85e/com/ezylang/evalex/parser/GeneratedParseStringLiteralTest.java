package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;
import java.math.MathContext;
import java.util.HashMap;
import java.util.function.Supplier;

public class GeneratedParseStringLiteralTest {

    @Test
    public void parseStringLiteralTest() throws ParseException {
        String expression = "'HelloWorld'";
        FunctionDictionaryIfc functionDictionary = Mockito.mock(FunctionDictionaryIfc.class);
        OperatorDictionaryIfc operatorDictionary = Mockito.mock(OperatorDictionaryIfc.class);
        MathContext mc = MathContext.DECIMAL32;
        Supplier supplier = () -> null;
        ExpressionConfiguration config = new ExpressionConfiguration(operatorDictionary, functionDictionary,
                mc, supplier, new HashMap(), false, false, false,
                100, 100, false, false);
        Tokenizer tokenizer = new Tokenizer(expression, config);
        Token token = tokenizer.parseStringLiteral();
        Assert.assertEquals("STRING", token.getType().name());
    }

}