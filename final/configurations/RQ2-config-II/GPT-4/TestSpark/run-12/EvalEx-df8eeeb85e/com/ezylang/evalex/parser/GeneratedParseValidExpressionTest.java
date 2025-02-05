package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedParseValidExpressionTest {

    @Test
    public void parseValidExpressionTest() throws ParseException {
        String validExpressionString = "3+4";
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);

        Tokenizer tokenizer = new Tokenizer(validExpressionString, config);
        List<Token> tokens = tokenizer.parse();

        assertNotNull(tokens);
        assertEquals(3, tokens.size());
    }

}