package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedParseThrowsParseExceptionClosingQuoteTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void parseThrowsParseExceptionClosingQuoteTest() throws ParseException {
        thrown.expect(ParseException.class);
        thrown.expectMessage("Closing quote not found");

        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        String exp = "\"hello world";
        Tokenizer tokenizer = new Tokenizer(exp, configuration);
        tokenizer.parse();
    }

}