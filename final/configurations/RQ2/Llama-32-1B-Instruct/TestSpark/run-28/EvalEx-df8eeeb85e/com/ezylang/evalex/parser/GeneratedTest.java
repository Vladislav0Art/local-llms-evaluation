package com.ezylang.evalex.parser;

import java.util.ArrayList;

public class GeneratedTest {

    @Test
    public void testParseNumber_ExpectTokenTypeNumber() throws ParseException {
        String expressionString = "123";

        Tokenizer tokenizer = new NumberParser();
        List<Token> tokens = tokenizer.tokenize(expressionString);

        for (Token token : tokens) {
            System.out.println(token.toString());
        }
    }

    @Test
    public void testParseOperator_ExpectTokenTypeOperator() throws ParseException {
        String expressionString = "+";

        Tokenizer tokenizer = new OperatorParser();
        List<Token> tokens = tokenizer.tokenize(expressionString);

        for (Token token : tokens) {
            System.out.println(token.toString());
        }
    }

    @Test
    public void testParseSubstring_ExpectTokenTypeSubstring() throws ParseException {
        String expressionString = "hello world";

        Tokenizer tokenizer = new NumberParser();
        List<Token> tokens = tokenizer.tokenize(expressionString);

        for (Token token : tokens) {
            System.out.println(token.toString());
        }
    }

    @Test
    public void testParseSubstring_ExpectTokenTypeNumberAndOperator() throws ParseException {
        String expressionString = "hello world+";

        Tokenizer tokenizer = new OperatorParser();
        List<Token> tokens = tokenizer.tokenize(expressionString);

        for (Token token : tokens) {
            System.out.println(token.toString());
        }
    }

    @Test
    public void testParseSubstring_ExpectTokenTypeNumberAndOperatorInExpression() throws ParseException {
        String expressionString = "hello world+abc";

        Tokenizer tokenizer = new OperatorParser();
        List<Token> tokens = tokenizer.tokenize(expressionString);

        for (Token token : tokens) {
            System.out.println(token.toString());
        }
    }

    @Test
    public void testParseSubstring_ExpectTokenTypeNumberAndOperatorInExpressionWithSpace() throws ParseException {
        String expressionString = " hello  world+abc";

        Tokenizer tokenizer = new OperatorParser();
        List<Token> tokens = tokenizer.tokenize(expressionString);

        for (Token token : tokens) {
            System.out.println(token.toString());
        }
    }

    @Test
    public void testParseOperator_ExpectTokenTypeOperatorInExpression() throws ParseException {
        String expressionString = "+abc";

        Tokenizer tokenizer = new OperatorParser();
        List<Token> tokens = tokenizer.tokenize(expressionString);

        for (Token token : tokens) {
            System.out.println(token.toString());
        }
    }

    @Test
    public void testParseSubstring_ExpectTokenTypeSubstringInExpression() throws ParseException {
        String expressionString = "hello world[";

        Tokenizer tokenizer = new OperatorParser();
        List<Token> tokens = tokenizer.tokenize(expressionString);

        for (Token token : tokens) {
            System.out.println(token.toString());
        }
    }

    @Test
    public void testParseSubstring_ExpectTokenTypeNumberAndOperatorInExpressionWithSpace() throws ParseException {
        String expressionString = " hello  world[";

        Tokenizer tokenizer = new OperatorParser();
        List<Token> tokens = tokenizer.tokenize(expressionString);

        for (Token token : tokens) {
            System.out.println(token.toString());
        }
    }

}