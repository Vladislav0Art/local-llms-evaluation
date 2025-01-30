package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseInvalidExpressionTest {

    @Test
    public void parseInvalidExpressionTest() {
        ExpressionConfiguration config = createMockConfig();
        Tokenizer tokenizer = new Tokenizer("1++2", config);
        try {
            tokenizer.parse();
            Assert.fail("ParseException was not thrown for invalid expression");
        } catch (ParseException e) {
            Assert.assertEquals("Unexpected token after infix operator", e.getMessage());
        }
    }

}