package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTokenizeNumberLiteral {

    @Test
    public void tokenizeNumberLiteral() {
        String expressionString = "123";
        List<Token> tokens = new ArrayList<>();
        try {
            Tokenizer tokenizer = new Tokenizer(expressionString, null);
            tokens = tokenizer.parse();
            assertTrue(tokens.get(0).getType() == NUMBER_LITERAL);
        } catch (ParseException e) {
        }
    }

}