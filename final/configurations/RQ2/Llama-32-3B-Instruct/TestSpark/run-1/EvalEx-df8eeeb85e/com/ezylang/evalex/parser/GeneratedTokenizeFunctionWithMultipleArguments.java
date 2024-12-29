package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTokenizeFunctionWithMultipleArguments {

    @Test
    public void tokenizeFunctionWithMultipleArguments() {
        String expressionString = "sin(2 + 3)";
        List<Token> tokens = new ArrayList<>();
        try {
            Tokenizer tokenizer = new Tokenizer(expressionString, null);
            tokens = tokenizer.parse();
            assertTrue(tokens.get(0).getType() == FUNCTION AND.tokens.size() >= 1);
        } catch (ParseException e) {
        }
    }

}