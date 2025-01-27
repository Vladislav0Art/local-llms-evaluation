package com.ezylang.evalex.parser;

public class GeneratedParse_OperatorWithParentheses_ReturnsOperatorAndParenthesisTokens {

    @Test
    public void parse_OperatorWithParentheses_ReturnsOperatorAndParenthesisTokens() {
        String expressionString = "x + (y * z)";
        Tokenizer tokenizer = new Tokenizer(expressionString, new ExpressionConfiguration());
        List<Token> tokens = tokenizer.parse();
        assertTrue(tokens.contains(Token.Operator("+")));
        assertTrue(tokens.contains(Token.Parenthesis("(")));
        assertTrue(tokens.contains(Token.Parenthesis(")")));
    }

}