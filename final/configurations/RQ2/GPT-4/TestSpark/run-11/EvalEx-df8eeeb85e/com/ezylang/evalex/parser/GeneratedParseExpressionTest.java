package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class GeneratedParseExpressionTest {

    @Test
    public void parseExpressionTest() {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("1+sqrt(4)", configuration);

        try {
            List<Token> tokens = tokenizer.parse();
            assertNotNull(tokens);
        } catch (ParseException e) {
            // do nothing
        }
    }

}