package com.ezylang.evalex.parser;

import java.util.ArrayList;

public class GeneratedTestParseSubstring_ExpectTokenTypeSubstring {

    @Test
    public void testParseSubstring_ExpectTokenTypeSubstring() throws ParseException {
        String expressionString = "hello world";

        Tokenizer tokenizer = new NumberParser();
        List<Token> tokens = tokenizer.tokenize(expressionString);

        for (Token token : tokens) {
            System.out.println(token.toString());
        }
    }

}