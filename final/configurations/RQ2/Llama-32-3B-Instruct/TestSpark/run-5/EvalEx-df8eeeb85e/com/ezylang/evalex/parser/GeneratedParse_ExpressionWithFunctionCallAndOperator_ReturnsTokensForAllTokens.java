package com.ezylang.evalex.parser;

public class GeneratedParse_ExpressionWithFunctionCallAndOperator_ReturnsTokensForAllTokens {

    @Test
    public void parse_ExpressionWithFunctionCallAndOperator_ReturnsTokensForAllTokens() {
        String expressionString = "sin(x) + y";
        Tokenizer tokenizer = new Tokenizer(expressionString, new ExpressionConfiguration());
        List<Token> tokens = tokenizer.parse();
        assertTrue(tokens.contains(Token.Function("sin")));
        assertTrue(tokens.contains(Token.Variable("x")));
        assertTrue(tokens.contains(Token.Operator("+")));
        assertTrue(tokens.contains(Token.Number(1)));
    }

}