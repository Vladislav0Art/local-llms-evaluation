package com.ezylang.evalex.parser;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;

public class GeneratedParseInvalidExpressionTest {

    @Test
    public void parseInvalidExpressionTest() throws ParseException {
        String testExpression = "2+2d"; // 'd' is not a valid number or operator
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(testExpression, configuration);
        tokenizer.parse();
    }

}