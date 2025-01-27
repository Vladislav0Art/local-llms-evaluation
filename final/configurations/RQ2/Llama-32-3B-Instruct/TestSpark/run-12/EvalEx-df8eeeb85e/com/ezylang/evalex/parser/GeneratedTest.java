package com.ezylang.evalex.parser;

public class GeneratedTest {

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
    public void testExpressionConfiguration() throws ParseException {
        ExpressionConfiguration expressionConfiguration = new ExpressionConfiguration();
        FunctionDictionaryIfc functionDictionaryIfc = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDictionaryIfc = new OperatorDictionaryIfc();

        expressionConfiguration.setFunctionDictionaryIfc(functionDictionaryIfc);
        expressionConfiguration.setOperatorDictionaryIfc(operatorDictionaryIfc);
    }
}

@Test
public void testToken() {
    Token token = new Token(TokenType.StringToken, "test");
    System.out.println(token.getType());
    System.out.println(token.getValue());
}

@Test
public void testTokenType() {
    System.out.println(TokenType.StringToken);
    System.out.println(TokenType.VariableToken);
    System.out.println(TokenType.SinFunctionToken);
    System.out.println(TokenType.CosFunctionToken);
    System.out.println(TokenType.PlusOperatorToken);
}

@Test
public void testExpressionConfiguration() throws ParseException {
    ExpressionConfiguration expressionConfiguration = new ExpressionConfiguration();
    FunctionDictionaryIfc functionDictionaryIfc = new FunctionDictionaryIfc();
    OperatorDictionaryIfc operatorDictionaryIfc = new OperatorDictionaryIfc();

    expressionConfiguration.setFunctionDictionaryIfc(functionDictionaryIfc);
    expressionConfiguration.setOperatorDictionaryIfc(operatorDictionaryIfc);
}

@Test
public void testParseException() {
    ParseException exception = new ParseException("Invalid character");
    System.out.println(exception.getMessage());
}

}