package com.ezylang.evalex.parser;

public class GeneratedTestTokenizerEqualsDoubleValue {

    private String expressionString;
    private ExpressionConfiguration configuration;

    public Tokenizer(String expressionString, ExpressionConfiguration configuration) {
        this.expressionString = expressionString;
        this.configuration = configuration;
    }

    public String getExpression() {
        return expressionString;
    }

    public String[] getOperators() {
        // Implement operator extraction logic
        return new String[0];
    }

    public double getTokenIndex(String token) {
        // Implement token index calculation logic
        return 0.0;
    }

    public String[] getFunctions() {
        // Implement function extraction logic
        return new String[0];
    }

    public boolean equals(double value) {
        // Implement equality comparison logic
        return false;
    }
}

public class ExpressionTest {

    @Test
    public void testTokenizerEqualsDoubleValue() {
        Tokenizer tokenizer = new Tokenizer("2+3*4", null);
        boolean equalsResult = tokenizer.equals(2.0);
        assertTrue(equalsResult); // Assuming 2 is a valid token index
    }

}