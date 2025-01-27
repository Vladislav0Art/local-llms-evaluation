package com.ezylang.evalex.parser;

public class GeneratedParse_ExpressionWithParenthesesAndOperators_ReturnsTokensForAllTokens {

    @Test
    public void parse_ExpressionWithParenthesesAndOperators_ReturnsTokensForAllTokens() {
        String expressionString = "(x + y) * (z - w)";
        Tokenizer tokenizer = new Tokenizer(expressionString, new ExpressionConfiguration());
        List<Token> tokens = tokenizer.parse();
        assertTrue(tokens.contains(Token.Parenthesis("(")));
        assertTrue(tokens.contains(Token.Operator("+")));
        assertTrue(tokens.contains(Token.Variable("x")));
        assertTrue(tokens.contains(Token.Number(1)));
        assertTrue(tokens.contains(Token.Operator("*")));
        assertTrue(tokens.contains(Token.Parenthesis(")")));
        assertTrue(tokens.contains(Token.Operator("*")));
        assertTrue(tokens.contains(Token.Operator("-")));
        assertTrue(tokens.contains(Token.Parenthesis("(")));
        assertTrue(tokens.contains(Token.Variable("z")));
        assertTrue(tokens.contains(Token.Number(2)));
        assertTrue(tokens.contains(Token.Operator("-")));
        assertTrue(tokens.contains(Token.Variable("w")));
        assertTrue(tokens.contains(Token.Parenthesis(")")));
    }

}