package com.ezylang.evalex.parser;

public class GeneratedParse_EmptyExpression_ReturnsEmptyList {

    @Test
    public void parse_EmptyExpression_ReturnsEmptyList() {
        List<Token> tokens = new ArrayList<>();
        Tokenizer tokenizer = new Tokenizer("", new ExpressionConfiguration());
        List<Token> result = tokenizer.parse();
        assertEquals(tokens, result);
    }

}