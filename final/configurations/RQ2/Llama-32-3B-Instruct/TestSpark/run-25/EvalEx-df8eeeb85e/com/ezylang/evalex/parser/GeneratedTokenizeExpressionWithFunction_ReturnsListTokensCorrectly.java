package com.ezylang.evalex.parser;

public class GeneratedTokenizeExpressionWithFunction_ReturnsListTokensCorrectly {

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
    public void tokenizeExpressionWithFunction_ReturnsListTokensCorrectly() {
        String expressionString = "SIN(1.5)";
        FunctionIfc function = new FunctionIfc("SIN", 1.5);
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new Token(TokenType.FUNCTION, "SIN"));
        expectedTokens.add(new Token(TokenType.NUMBER, "1.5"));

        Tokenizer tokenizer = new Tokenizer(expressionString, ExpressionConfiguration.getStandardConfiguration());
        List<Token> actualTokens = tokenizer.parse();

        assertEquals(expectedTokens, actualTokens);
    }

}