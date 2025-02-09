package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.*;

public class GeneratedParseStringLiteralInvalidStringTest {

    @Test
    public void parseStringLiteralInvalidStringTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration(mock(FunctionDictionaryIfc.class), mock(OperatorDictionaryIfc.class), false);
        Tokenizer tokenizer = new Tokenizer("InvalidStringLiteral", config);
        tokenizer.parseStringLiteral();
    }

}