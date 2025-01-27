package com.ezylang.evalex.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GeneratedParseStringLiteral_invalidLiteral {

    @Test
    public void parseStringLiteral_invalidLiteral() {
        Tokenizer tokenizer = new Tokenizer("'h'", new ExpressionConfiguration());
        try {
            List<Token> tokens = tokenizer.parse();
            fail("ParseException was not thrown");
        } catch (ParseException e) {
            // Expected
        }
    }

}