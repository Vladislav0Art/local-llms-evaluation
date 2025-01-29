package com.ezylang.evalex.parser;

import java.util.ArrayList;

public class GeneratedTestParseNumber_ExpectTokenTypeNumber {

    @Test
    public void testParseNumber_ExpectTokenTypeNumber() throws ParseException {
        String expressionString = "123";

        Tokenizer tokenizer = new NumberParser();
        List<Token> tokens = tokenizer.tokenize(expressionString);

        for (Token token : tokens) {
            System.out.println(token.toString());
        }
    }

}