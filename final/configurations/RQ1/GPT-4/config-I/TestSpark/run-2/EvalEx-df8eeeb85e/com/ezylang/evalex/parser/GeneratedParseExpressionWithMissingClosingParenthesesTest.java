package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedParseExpressionWithMissingClosingParenthesesTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void parseExpressionWithMissingClosingParenthesesTest() throws ParseException {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("(1+1*2", config);
        thrown.expect(ParseException.class);
        thrown.expectMessage("Closing brace not found");
        tokenizer.parse();
    }

}