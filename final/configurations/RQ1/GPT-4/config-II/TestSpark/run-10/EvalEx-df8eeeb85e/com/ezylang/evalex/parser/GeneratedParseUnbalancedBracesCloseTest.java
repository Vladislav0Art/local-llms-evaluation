package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseUnbalancedBracesCloseTest {

    @Mock
    private ExpressionConfiguration configuration;

    @Test
    public void parseUnbalancedBracesCloseTest() throws ParseException {
        String expression = "(1+2))";
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        tokenizer.parse();
    }

}