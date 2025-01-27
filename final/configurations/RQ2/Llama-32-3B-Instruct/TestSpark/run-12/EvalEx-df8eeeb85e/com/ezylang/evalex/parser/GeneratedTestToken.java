package com.ezylang.evalex.parser;

public class GeneratedTestToken {

    private TokenType type;
    private String value;

    public Token(TokenType type, String value) {
        this.type = type;
        this.value = value;
    }

    public TokenType getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}

public enum TokenType {
    StringToken,
    VariableToken,
    SinFunctionToken,
    CosFunctionToken,
    PlusOperatorToken
}

public class ExpressionConfiguration {
    private FunctionDictionaryIfc functionDictionaryIfc;
    private OperatorDictionaryIfc operatorDictionaryIfc;

    public void setFunctionDictionaryIfc(FunctionDictionaryIfc functionDictionaryIfc) {
        this.functionDictionaryIfc = functionDictionaryIfc;
    }

    public void setOperatorDictionaryIfc(OperatorDictionaryIfc operatorDictionaryIfc) {
        this.operatorDictionaryIfc = operatorDictionaryIfc;
    }
}

public class FunctionDictionaryIfc {
    // methods
}

public interface FunctionDictionaryIfc {
    // methods
}

public class OperatorDictionaryIfc {
    // methods
}

public interface OperatorDictionaryIfc {
    // methods
}

public class ParseException extends Exception {
    public ParseException(String message) {
        super(message);
    }
}

public class TestSpark {

    @Test
    public void testToken() {
        Token token = new Token(TokenType.StringToken, "test");
        System.out.println(token.getType());
        System.out.println(token.getValue());
    }

}