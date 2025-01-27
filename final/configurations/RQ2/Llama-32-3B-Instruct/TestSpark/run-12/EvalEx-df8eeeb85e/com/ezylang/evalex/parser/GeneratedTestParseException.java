package com.ezylang.evalex.parser;

public class GeneratedTestParseException {

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
    public void testParseException() {
        ParseException exception = new ParseException("Invalid character");
        System.out.println(exception.getMessage());
    }

}