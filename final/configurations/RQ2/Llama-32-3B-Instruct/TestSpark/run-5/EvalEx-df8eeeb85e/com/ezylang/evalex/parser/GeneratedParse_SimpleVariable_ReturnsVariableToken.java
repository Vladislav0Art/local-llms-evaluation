package com.ezylang.evalex.parser;

public class GeneratedParse_SimpleVariable_ReturnsVariableToken {

    @Test
    public void parse_SimpleVariable_ReturnsVariableToken() {
        String expressionString = "x";
        Tokenizer tokenizer = new Tokenizer(expressionString, new ExpressionConfiguration());
        List<Token> tokens = tokenizer.parse();
        assertTrue(tokens.contains(Token.Variable("x")));
    }

}