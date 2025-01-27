package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import com.ezylang.evalex.parser.Token.*;

public class GeneratedParseStringLiteralFromLiteralToken {

    @Test
    public void parseStringLiteralFromLiteralToken() throws ParseException {
        String expressionString = "123";
        List<Token> tokens = new ArrayList<>();
        tokens.add(new Literal(123));
        assertEquals(tokens, new Tokenizer(expressionString, new ExpressionConfiguration()).parseStringLiteral());
    }

}