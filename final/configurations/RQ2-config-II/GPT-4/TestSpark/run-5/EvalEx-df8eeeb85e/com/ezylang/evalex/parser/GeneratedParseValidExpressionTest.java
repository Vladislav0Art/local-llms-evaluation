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

public class GeneratedParseValidExpressionTest {

    @Test
    public void parseValidExpressionTest() {
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        String validExpression = "2+2";
        Tokenizer tokenizer = new Tokenizer(validExpression, mockConfig);

        try {
            List<Token> tokens = tokenizer.parse();
            assertEquals(3, tokens.size());
        } catch (ParseException e) {
            fail("Parsing failed for valid expression");
        }
    }

}