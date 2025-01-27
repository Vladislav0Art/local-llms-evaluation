package com.ezylang.evalex.parser;

public class GeneratedParseMethodReturnsList {

    private String value;
    private TokenType type;

    public Token(String value) {
        this.value = value;
        this.type = TokenType.LITERAL;
    }

    public static Token createToken(String value) {
        return new Token(value);
    }
}

public enum TokenType {
    LITERAL,
    ADDITION,
    SUBTRACTION,
    MULITIPlication
}

public class ExpressionConfiguration {
}

public class Tokenizer {
    public List<Token> parse(String expressionString, ExpressionConfiguration configuration) throws ParseException {
        // implementation
        return new ArrayList<>();
    }

    public static Token createTokenFromLiteral(String value) throws ParseException {
        // implementation
        throw new UnsupportedOperationException();
    }
}

public class ParseException extends Exception {
}

public class GeneratedTest {

    @Test
    public void parseMethodReturnsList() {
        String expressionString = "1+2";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        List<Token> result = Tokenizer.parse(expressionString, configuration);
        assertNotNull(result);
    }

}