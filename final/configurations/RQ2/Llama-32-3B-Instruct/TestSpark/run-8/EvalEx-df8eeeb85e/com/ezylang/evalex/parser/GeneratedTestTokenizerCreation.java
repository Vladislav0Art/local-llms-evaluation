package com.ezylang.evalex.parser;

public class GeneratedTestTokenizerCreation {

    private String expressionString;
    private ExpressionConfiguration configuration;

    public Tokenizer(String expressionString, ExpressionConfiguration configuration) {
        this.expressionString = expressionString;
        this.configuration = configuration;
    }

    public List<Token> parse() {
        // implementation
    }
}

public class FunctionDictionaryIfc {
}

public class OperatorDictionaryIfc {
}

public class ExpressionConfiguration {
    private FunctionDictionaryIfc functionDictionaryIfc = new FunctionDictionaryIfc();
    private OperatorDictionaryIfc operatorDictionaryIfc = new OperatorDictionaryIfc();

    public void setFunctionDictionaryIfc(FunctionDictionaryIfc functionDictionaryIfc) {
        this.functionDictionaryIfc = functionDictionaryIfc;
    }

    public void setOperatorDictionaryIfc(OperatorDictionaryIfc operatorDictionaryIfc) {
        this.operatorDictionaryIfc = operatorDictionaryIfc;
    }
}

public class Token {

    private TokenType type;

    public Token(TokenType type) {
        this.type = type;
    }

    public TokenType getType() {
        return type;
    }
}

public enum TokenType {
    NUMBER, SYMBOL
}

public class GeneratedTest {

    @Test
    public void testTokenizerCreation() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        String expressionString = "example";
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
    }

}