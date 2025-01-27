package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import com.ezylang.evalex.parser.Token.*;

public class GeneratedParseStringLiteralFromIdentifierToken {

    @Test
    public void parseStringLiteralFromIdentifierToken() throws ParseException {
        String expressionString = "x";
        List<Token> tokens = new ArrayList<>();
        tokens.add(new Identifier("x"));
        assertEquals(tokens, new Tokenizer(expressionString, new ExpressionConfiguration()).parseStringLiteral());
    }

}