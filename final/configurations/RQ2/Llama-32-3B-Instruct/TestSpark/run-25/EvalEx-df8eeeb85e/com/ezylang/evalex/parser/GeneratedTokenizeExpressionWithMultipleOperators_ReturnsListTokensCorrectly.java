package com.ezylang.evalex.parser;

public class GeneratedTokenizeExpressionWithMultipleOperators_ReturnsListTokensCorrectly {

    @Test
    public void tokenizeExpressionWithMultipleOperators_ReturnsListTokensCorrectly() {
        String expressionString = "A+B*C+D";
        OperatorIfc operator1 = new OperatorIfc("+", true);
        OperatorIfc operator2 = new OperatorIfc("*", false);
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new Token(TokenType.OPERATOR, "+"));
        expectedTokens.add(new Token(TokenType.ASSIGNMENT, "="));
        expectedTokens.add(new Token(TokenType.MUL, "*"));
        expectedTokens.add(new Token(TokenType.OPERATOR, "*"));
        expectedTokens.add(new Token(TokenType.OPERATOR, "+"));

        Tokenizer tokenizer = new Tokenizer(expressionString, ExpressionConfiguration.getStandardConfiguration());
        List<Token> actualTokens = tokenizer.parse();

        assertEquals(expectedTokens, actualTokens);
    }

}