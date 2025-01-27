package com.ezylang.evalex.parser;

public class GeneratedParse_Operator_ReturnsOperatorToken {

    @Test
    public void parse_Operator_ReturnsOperatorToken() {
        String expressionString = "x + y";
        Tokenizer tokenizer = new Tokenizer(expressionString, new ExpressionConfiguration());
        List<Token> tokens = tokenizer.parse();
        assertTrue(tokens.contains(Token.Operator("+")));
    }

}