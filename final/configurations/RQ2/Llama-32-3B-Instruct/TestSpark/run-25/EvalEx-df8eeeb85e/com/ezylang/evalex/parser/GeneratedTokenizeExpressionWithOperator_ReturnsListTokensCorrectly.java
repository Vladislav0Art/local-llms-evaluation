package com.ezylang.evalex.parser;

public class GeneratedTokenizeExpressionWithOperator_ReturnsListTokensCorrectly {

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
    public void tokenizeExpressionWithOperator_ReturnsListTokensCorrectly() {
        String expressionString = "A+B*C";
        OperatorIfc operator = new OperatorIfc("+", true);
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new Token(TokenType.OPERATOR, "+"));
        expectedTokens.add(new Token(TokenType.FUNCTION, "B"));
        expectedTokens.add(new Token(TokenType.COMMA, ","));
        expectedTokens.add(new Token(TokenType.NUMBER, "1"));
        expectedTokens.add(new Token(TokenType.OPERATOR, "*"));
        expectedTokens.add(new Token(TokenType.FUNCTION, "C"));

        Tokenizer tokenizer = new Tokenizer(expressionString, ExpressionConfiguration.getStandardConfiguration());
        List<Token> actualTokens = tokenizer.parse();

        assertEquals(expectedTokens, actualTokens);
    }

}