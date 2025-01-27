package com.ezylang.evalex.parser;

public class GeneratedTokenizeEmptyExpression_ReturnsListTokensCorrectly {

    @Test
    public void tokenizeEmptyExpression_ReturnsListTokensCorrectly() {
        String expressionString = "";
        List<Token> expectedTokens = new ArrayList<>();

        Tokenizer tokenizer = new Tokenizer(expressionString, ExpressionConfiguration.getStandardConfiguration());
        List<Token> actualTokens = tokenizer.parse();

        assertEquals(expectedTokens, actualTokens);
    }

}