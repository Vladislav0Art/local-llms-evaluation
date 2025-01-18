package com.ezylang.evalex.parser;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;

public class GeneratedParseValidExpressionTest {

    @Test
    public void parseValidExpressionTest() throws ParseException {
        String testExpression = "2+2";
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(testExpression, configuration);
        List<Token> parsedResponse = tokenizer.parse();
        assertEquals(3, parsedResponse.size());  // 2 numbers and an operator: [2, +, 2]
    }

}