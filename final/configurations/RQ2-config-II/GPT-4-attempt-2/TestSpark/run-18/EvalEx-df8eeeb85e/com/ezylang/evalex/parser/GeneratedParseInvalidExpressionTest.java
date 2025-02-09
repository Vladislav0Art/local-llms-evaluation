package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedParseInvalidExpressionTest {

    @Test
    public void parseInvalidExpressionTest() throws ParseException {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("10 ## 20 * 30", config);
        tokenizer.parse();
    }

}