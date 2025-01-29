package com.ezylang.evalex.parser;

import java.util.ArrayList;

public class GeneratedTestParseSubstring_ExpectTokenTypeNumberAndOperatorInExpression {

    @Test
    public void testParseSubstring_ExpectTokenTypeNumberAndOperatorInExpression() throws ParseException {
        String expressionString = "hello world+abc";

        Tokenizer tokenizer = new OperatorParser();
        List<Token> tokens = tokenizer.tokenize(expressionString);

        for (Token token : tokens) {
            System.out.println(token.toString());
        }
    }

}