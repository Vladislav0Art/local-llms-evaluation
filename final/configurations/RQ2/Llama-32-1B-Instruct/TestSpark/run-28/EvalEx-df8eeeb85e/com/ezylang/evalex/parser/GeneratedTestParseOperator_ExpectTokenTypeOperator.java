package com.ezylang.evalex.parser;

import java.util.ArrayList;

public class GeneratedTestParseOperator_ExpectTokenTypeOperator {

    @Test
    public void testParseOperator_ExpectTokenTypeOperator() throws ParseException {
        String expressionString = "+";

        Tokenizer tokenizer = new OperatorParser();
        List<Token> tokens = tokenizer.tokenize(expressionString);

        for (Token token : tokens) {
            System.out.println(token.toString());
        }
    }

}