package com.ezylang.evalex.parser;

public class GeneratedTestTokenizer_parseExpression_ReturnsListTokensCorrectly {

    @Test
    public void testTokenizer_parseExpression_ReturnsListTokensCorrectly() {
        String expressionString = "1+2*3";
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new Token(TokenType.NUMBER, "1"));
        expectedTokens.add(new Token(TokenType.MUL, "*"));
        expectedTokens.add(new Token(TokenType.NUMBER, "2"));
        expectedTokens.add(new Token(TokenType.ADD, "+"));
        expectedTokens.add(new Token(TokenType.NUMBER, "3"));

        Tokenizer tokenizer = new Tokenizer(expressionString, ExpressionConfiguration.getStandardConfiguration());
        List<Token> actualTokens = tokenizer.parse();

        assertEquals(expectedTokens, actualTokens);
    }

}