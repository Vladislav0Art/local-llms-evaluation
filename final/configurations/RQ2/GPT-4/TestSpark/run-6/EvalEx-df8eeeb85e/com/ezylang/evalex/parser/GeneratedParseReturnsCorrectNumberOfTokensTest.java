package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedParseReturnsCorrectNumberOfTokensTest {

    ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);

    @Test
    public void parseReturnsCorrectNumberOfTokensTest() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("5 + 3 * 2", config);
        List<Token> tokens = tokenizer.parse();
        assertEquals(5, tokens.size());
    }

}