package com.ezylang.evalex.parser;

public class GeneratedParseStringLiteralReturnsToken {

    public static final int LITERAL = 1;

    private String value;
    private TokenType type;

    public Token(String value) {
        this.value = value;
        this.type = TokenType.LITERAL;
    }

    public TokenType getType() {
        return type;
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
    public static List<Token> parse(String expressionString, ExpressionConfiguration configuration) throws ParseException {
        // implementation
        return null;
    }

    public static Token parseStringLiteral(String value) throws ParseException {
        // implementation
        throw new UnsupportedOperationException();
    }
}

public class ParseException extends Exception {
}

public class GeneratedTest {

    @Test
    public void parseStringLiteralReturnsToken() throws ParseException {
        String value = "'test'";
        Token result = Tokenizer.parseStringLiteral(value);
        assertNotNull(result);
        assertEquals(Token.TokenType.LITERAL, result.getType());
        assertEquals("test", result.value);
    }

}