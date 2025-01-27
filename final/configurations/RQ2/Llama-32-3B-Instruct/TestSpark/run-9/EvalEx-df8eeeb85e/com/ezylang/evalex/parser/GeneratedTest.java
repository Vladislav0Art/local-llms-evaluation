package com.ezylang.evalex.parser;

public class GeneratedTest {

    private String type;

    public Token(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

public class FunctionIfc {
    public static final String OPERATOR_NAME = "+";
}

public class ExpressionConfiguration {
    private FunctionIfc function;
    private OperatorIfc operator;

    public void setFunction(FunctionIfc function) {
        this.function = function;
    }

    public void setOperator(OperatorIfc operator) {
        this.operator = operator;
    }
}

public class GeneratedTest {

    @Before
    public void setup() {
        ExpressionConfiguration expressionConfiguration = new ExpressionConfiguration();

        FunctionIfc function = new FunctionIfc();
        OperatorIfc operator = new OperatorIfc();

        expressionConfiguration.setFunction(function);
        expressionConfiguration.setOperator(operator);

        // Add tokens to the list
        List<Token> tokens = new ArrayList<>();
        Token token1 = new Token(OperatorIfc.OPERATOR_NAME);
        Token token2 = new Token("+");
        Token token3 = new Token(OperatorIfc.OPERATOR_NAME);
        Token token4 = new Token("-");
        tokens.add(token1);
        tokens.add(token2);
        tokens.add(token3);
        tokens.add(token4);

        // Get the first token from the list
        Token firstToken = tokens.get(0);
    }

}