package com.ezylang.evalex.parser;

public class GeneratedTokenizeExpression_ReturnsListTokensCorrectly {

    public static class Token {
        private TokenType type;
        private String value;

        public Token(TokenType type, String value) {
            this.type = type;
            this.value = value;
        }

        // getters and setters
    }

    public enum TokenType {
        NUMBER,
        MUL,
        ADD,
        FUNCTION,
        OPERATOR,
        ASSIGNMENT,
        COMMA
    }

    public class ParseException extends RuntimeException {
        public ParseException(String message) {
            super(message);
        }
    }

    @Test
    public void tokenizeExpression_ReturnsListTokensCorrectly() {
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