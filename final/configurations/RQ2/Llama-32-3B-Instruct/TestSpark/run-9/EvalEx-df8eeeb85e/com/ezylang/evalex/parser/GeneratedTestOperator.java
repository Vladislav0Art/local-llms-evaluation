package com.ezylang.evalex.parser;

public class GeneratedTestOperator {

    public static final String OPERATOR_NAME = "-";
}

public class Token {
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
    public void setFunction(FunctionIfc function) {
        // Add logic here
    }

    public void setOperator(OperatorIfc operator) {
        // Add logic here
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
        tokens.add(new Token(OperatorIfc.OPERATOR_NAME));
        tokens.add(new Token("+"));
        tokens.add(new Token(OperatorIfc.OPERATOR_NAME));
        tokens.add(new Token("-"));

        // Get the first token from the list
        Token token = tokens.get(0);
    }

    @Test
    public void testOperator() {
        // Given:
        OperatorIfc operator = new OperatorIfc();

        // When
        ExpressionConfiguration expressionConfiguration = new ExpressionConfiguration();
        expressionConfiguration.setOperator(operator);

        // Then
        assertEquals(OperatorIfc.OPERATOR_NAME, ((Token) expressionConfiguration.getOperator()).getType());
    }

}