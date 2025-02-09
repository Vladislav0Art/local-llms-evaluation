package com.ezylang.evalex.parser;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

import org.junit.Test;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseEmptyStringTest {

    @Test
    public void parseEmptyStringTest() {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("", configuration);
        try {
            List<Token> tokens = tokenizer.parse();
            assertTrue(tokens.isEmpty());
        } catch (ParseException e) {
            fail("ParseException should not have been thrown for an empty string");
        }
    }

}