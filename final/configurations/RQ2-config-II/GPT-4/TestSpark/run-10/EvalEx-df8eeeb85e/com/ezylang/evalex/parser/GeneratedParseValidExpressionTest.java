package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

public class GeneratedParseValidExpressionTest {

    @Test
    public void parseValidExpressionTest() {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("2+2", config);
        try {
            assertEquals(3, tokenizer.parse().size()); // Two operands and one operator
        } catch (ParseException e) {
            fail("Exception should not have been thrown");
        }
    }

}