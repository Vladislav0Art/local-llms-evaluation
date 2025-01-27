package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedParseMethodThrowsParseExceptionTest {

    @Test
    public void parseMethodThrowsParseExceptionTest() throws ParseException {
        String expressionString = "expression_string";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        assertThrows(ParseException.class, () -> tokenizer.parse());
    }

}