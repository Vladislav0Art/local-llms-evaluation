package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseValidExpressionStringTest {

    @Test
    public void parseValidExpressionStringTest() throws ParseException {
        ExpressionConfiguration configuration = mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("2+2", configuration);
        List<Token> tokens = tokenizer.parse();
        assertNotNull(tokens);
        assertEquals(3, tokens.size());
    }

}