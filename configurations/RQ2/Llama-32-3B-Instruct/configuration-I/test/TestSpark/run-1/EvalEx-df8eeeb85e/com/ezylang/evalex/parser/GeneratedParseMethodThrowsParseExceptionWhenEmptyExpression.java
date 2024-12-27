package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

public class GeneratedParseMethodThrowsParseExceptionWhenEmptyExpression {

    @Test
    public void parseMethodThrowsParseExceptionWhenEmptyExpression() {
        Tokenizer tokenizer = new Tokenizer("");
        assertThrows(ParseException.class, () -> tokenizer.parse());
    }

}