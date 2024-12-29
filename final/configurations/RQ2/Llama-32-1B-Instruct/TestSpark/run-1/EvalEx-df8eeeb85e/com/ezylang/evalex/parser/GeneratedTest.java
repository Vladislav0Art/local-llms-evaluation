package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;

public class GeneratedTest {

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