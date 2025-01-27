package com.ezylang.evalex.parser;

public class GeneratedTestTokenizer_parseExpressionWithOperator_ReturnsListTokensCorrectly {

    @Test
    public void testTokenizer_parseExpressionWithOperator_ReturnsListTokensCorrectly() {
        String expressionString = "(1 + 2) * 3";
        OperatorIfc operator = new OperatorIfcImpl("+", true);
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new Token(TokenType.NUMBER, "1"));
        expectedTokens.add(new Token(TokenType.ADD, "+"));
        expectedTokens.add(new Token(TokenType.NUMBER, "2"));
        expectedTokens.add(new Token(TokenType.MUL, "*"));
        expectedTokens.add(new Token(TokenType.NUMBER, "3"));

        Tokenizer tokenizer = new Tokenizer(expressionString, ExpressionConfiguration.getStandardConfiguration());
        List<Token> actualTokens = tokenizer.parse();

        assertEquals(expectedTokens, actualTokens);
    }
}

public class Tokenizer {
    private String expressionString;
    private Configuration configuration;

    public Tokenizer(String expressionString, Configuration configuration) {
        this.expressionString = expressionString;
        this.configuration = configuration;
    }

    public List<Token> parse() {
        // implement tokenizer logic
        return new ArrayList<>();
    }
}

public class Context {
    private double value;

    public Context(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

}