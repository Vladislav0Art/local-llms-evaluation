package com.ezylang.evalex.parser;

import java.util.ArrayList;

public class GeneratedTestParseOperator_ExpectTokenTypeOperatorInExpression {

    @Test
    public void testParseOperator_ExpectTokenTypeOperatorInExpression() throws ParseException {
        String expressionString = "+abc";

        Tokenizer tokenizer = new OperatorParser();
        List<Token> tokens = tokenizer.tokenize(expressionString);

        for (Token token : tokens) {
            System.out.println(token.toString());
        }
    }

}