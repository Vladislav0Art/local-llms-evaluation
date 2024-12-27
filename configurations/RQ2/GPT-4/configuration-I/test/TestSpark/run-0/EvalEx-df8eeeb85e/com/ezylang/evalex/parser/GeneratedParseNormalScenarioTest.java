package com.ezylang.evalex.parser;

import org.junit.Test;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.ExpressionConfiguration;

import java.text.ParseException;
import java.util.List;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedParseNormalScenarioTest {

    @Test
    public void parseNormalScenarioTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration();
        try {
            Tokenizer tokenizer = new Tokenizer("1+1", config);
            List<Token> tokens = tokenizer.parse();
            assertNotNull(tokens);
            assertEquals(3, tokens.size());
        } catch (ParseException pe) {
            fail("ParseException should not be thrown for valid expressions");
        }
    }

}