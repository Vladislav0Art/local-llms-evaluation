package com.ezylang.evalex.parser;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;

public class GeneratedParseStringLiteralValidTest {

    @Test
    public void parseStringLiteralValidTest() throws ParseException {
        String testExpression = "\"hello\"";
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        new Tokenizer(testExpression, configuration).parseStringLiteral();
    }

}