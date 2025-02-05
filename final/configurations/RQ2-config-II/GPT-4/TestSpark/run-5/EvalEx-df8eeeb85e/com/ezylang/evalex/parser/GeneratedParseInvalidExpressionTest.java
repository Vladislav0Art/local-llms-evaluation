package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.exceptions.ParseException;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.Token;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

public class GeneratedParseInvalidExpressionTest {

    @Test
    public void parseInvalidExpressionTest() {
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        String invalidExpression = "2++2";
        Tokenizer tokenizer = new Tokenizer(invalidExpression, mockConfig);

        try {
            tokenizer.parse();
            fail("Parse method did not throw ParseException for invalid expression");
        } catch (ParseException ignored) {
        }
    }

}