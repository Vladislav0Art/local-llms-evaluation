package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;

public class GeneratedTestExpression {

    @Test
    public void testExpression() {
        // Test expression creation
        String input = "1 + 2 * 3";
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

        // Test expression evaluation
        EvalexParser parser = new EvalexParser(input);
        try {
            parser.parse();
            System.out.println("Result: " + tokens.get(tokens.size() - 1).value);  // Should print "5"
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}