package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseMalformedExpressionTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void parseMalformedExpressionTest() throws Exception {
        expectedException.expect(Exception.class);
        expectedException.expectMessage("Closing brace not found");
        ExpressionConfiguration configuration = ExpressionConfiguration.builder().build();
        Tokenizer tokenizer = new Tokenizer("sin(", configuration);
        tokenizer.parse();
    }

}