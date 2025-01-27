package com.ezylang.evalex.parser;

public class GeneratedParse_ExpressionWithMultipleOperators_ReturnsTokensForAllOperators {

    @Test
    public void parse_ExpressionWithMultipleOperators_ReturnsTokensForAllOperators() {
        String expressionString = "x + y * z";
        Tokenizer tokenizer = new Tokenizer(expressionString, new ExpressionConfiguration());
        List<Token> tokens = tokenizer.parse();
        assertTrue(tokens.contains(Token.Operator("+")));
        assertTrue(tokens.contains(Token.Operator("*")));
    }

}