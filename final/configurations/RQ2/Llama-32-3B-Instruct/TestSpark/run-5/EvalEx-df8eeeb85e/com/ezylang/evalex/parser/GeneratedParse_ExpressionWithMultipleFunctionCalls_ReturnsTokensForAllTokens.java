package com.ezylang.evalex.parser;

public class GeneratedParse_ExpressionWithMultipleFunctionCalls_ReturnsTokensForAllTokens {

    @Test
    public void parse_ExpressionWithMultipleFunctionCalls_ReturnsTokensForAllTokens() {
        String expressionString = "sin(x) + cos(y)";
        Tokenizer tokenizer = new Tokenizer(expressionString, new ExpressionConfiguration());
        List<Token> tokens = tokenizer.parse();
        assertTrue(tokens.contains(Token.Function("sin")));
        assertTrue(tokens.contains(Token.Variable("x")));
        assertTrue(tokens.contains(Token.Operator("+")));
        assertTrue(tokens.contains(Token.Function("cos")));
        assertTrue(tokens.contains(Token.Variable("y")));
    }

}