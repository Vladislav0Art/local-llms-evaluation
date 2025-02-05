package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseInvalidExpressionParseExceptionTest {

    @Test
    public void parseInvalidExpressionParseExceptionTest() throws ParseException {
        String mockString = "Invalid_Expression";
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(mockString, mockConfig);
        tokenizer.parse();
    }

}