package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;

public class GeneratedTestInvalidInput {

    @Test
    public void testInvalidInput() {
        // Test invalid input
        String input = "1 + 2 *";
        List<Token> tokens = new ArrayList<>();
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                Token token = new Token();
                token.type = Character.toString(c);
                tokens.add(token);
            } else if (c == '+' || c == '*') {
                token.type = "OPERATOR";
                tokens.add(token);
            }
        }

        // Test invalid input
        EvalexParser parser = new EvalexParser(input);
        try {
            parser.parse();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}