package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import com.ezylang.evalex.parser.Token.*;

public class GeneratedParseStringLiteralFromOperatorToken {

    @Test
    public void parseStringLiteralFromOperatorToken() throws ParseException {
        String expressionString = "+";
        List<Token> tokens = new ArrayList<>();
        tokens.add(new Operator(ADD));
        assertEquals(tokens, new Tokenizer(expressionString, new ExpressionConfiguration()).parseStringLiteral());
    }

}