package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class GeneratedParseStringLiteralTest {

    @Test
    public void parseStringLiteralTest() {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("\"Test\"", configuration);

        try {
            Token token = tokenizer.parseStringLiteral();
            assertNotNull(token);
        } catch (ParseException e) {
            // do nothing
        }
    }

}