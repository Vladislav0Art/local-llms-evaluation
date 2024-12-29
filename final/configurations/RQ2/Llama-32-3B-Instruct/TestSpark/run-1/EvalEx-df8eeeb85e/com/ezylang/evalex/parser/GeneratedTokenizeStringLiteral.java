package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTokenizeStringLiteral {

    @Test
    public void tokenizeStringLiteral() {
        String expressionString = "hello world";
        List<Token> tokens = new ArrayList<>();
        try {
            Tokenizer tokenizer = new Tokenizer(expressionString, null);
            tokens = tokenizer.parse();
            assertTrue(tokens.get(0).getType() == STR_LITERAL);
        } catch (ParseException e) {
        }
    }

}