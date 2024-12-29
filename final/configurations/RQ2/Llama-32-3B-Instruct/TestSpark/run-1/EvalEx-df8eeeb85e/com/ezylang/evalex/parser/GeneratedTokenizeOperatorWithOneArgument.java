package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTokenizeOperatorWithOneArgument {

    @Test
    public void tokenizeOperatorWithOneArgument() {
        String expressionString = "+ 2";
        List<Token> tokens = new ArrayList<>();
        try {
            Tokenizer tokenizer = new Tokenizer(expressionString, null);
            tokens = tokenizer.parse();
            assertTrue(tokens.get(0).getType() == OPERATOR AND.tokens.size() == 1);
        } catch (ParseException e) {
        }
    }

}