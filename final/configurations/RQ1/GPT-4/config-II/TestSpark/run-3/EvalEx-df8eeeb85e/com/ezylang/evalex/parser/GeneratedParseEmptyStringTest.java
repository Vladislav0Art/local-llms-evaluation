package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedParseEmptyStringTest {

    @Test
    public void parseEmptyStringTest() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("", configuration);
        try {
            assertEquals(0, tokenizer.parse().size());
        } catch (ParseException e) {
            fail("Unexpected ParseException thrown");
        }
    }

}