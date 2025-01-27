package com.ezylang.evalex.parser;

public class GeneratedParse_ExpressionWithMultipleOperatorsAndVariables_ReturnsTokensForAllTokens {

    @Test
    public void parse_ExpressionWithMultipleOperatorsAndVariables_ReturnsTokensForAllTokens() {
        String expressionString = "x + y * z - w";
        Tokenizer tokenizer = new Tokenizer(expressionString, new ExpressionConfiguration());
        List<Token> tokens = tokenizer.parse();
        assertTrue(tokens.contains(Token.Variable("x")));
        assertTrue(tokens.contains(Token.Operator("+")));
        assertTrue(tokens.contains(Token.Number(1)));
        assertTrue(tokens.contains(Token.Operator("*")));
        assertTrue(tokens.contains(Token.Variable("y")));
        assertTrue(tokens.contains(Token.Number(2)));
        assertTrue(tokens.contains(Token.Operator("-")));
        assertTrue(tokens.contains(Token.Variable("w")));
    }

}