package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;

public class GeneratedTestToken {

    @Test
    public void testToken() {
        // Test token creation
        String input = "Hello, World!";
        List<Token> tokens = new ArrayList<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                Token token = new Token();
                token.type = Character.toString(c);
                tokens.add(token);
            }
        }

        // Test token type
        System.out.println(tokens.get(0).type);  // Should print 'A'

        // Test empty input
        input = "";
        try {
            tokens.clear();
            EvalexParser parser = new EvalexParser(input);
            parser.parse();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}