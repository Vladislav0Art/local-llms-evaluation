package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedParseInvalidExpression {

    @Test
    public void parseInvalidExpression() throws ParseException {
        Tokenizer tokenizer = new Tokenizer(" invalid_expression ", null);
        assertThrows(ParseException.class, () -> tokenizer.parse());
    }

}