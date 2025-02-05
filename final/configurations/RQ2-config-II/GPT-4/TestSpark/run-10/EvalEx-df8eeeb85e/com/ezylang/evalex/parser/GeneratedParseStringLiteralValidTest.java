package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

public class GeneratedParseStringLiteralValidTest {

    @Test
    public void parseStringLiteralValidTest() {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("\"Test\"", config);
        try {
            assertEquals(TokenType.STRING, tokenizer.parseStringLiteral().getType());
        } catch (ParseException e) {
            fail("Exception should not have been thrown");
        }
    }

}