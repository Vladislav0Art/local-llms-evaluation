package com.ezylang.evalex.parser;

import java.util.ArrayList;

public class GeneratedTestParseSubstring_ExpectTokenTypeNumberAndOperatorInExpressionWithSpace {

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