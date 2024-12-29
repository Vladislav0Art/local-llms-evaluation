package com.ezylang.evalex.parser;

public class GeneratedTestGetFunctions {

    public String toString() {
        return "ExpressionConfiguration";
    }
}

public class Tokenizer {
    private String expressionString;
    private int tokenIndex = 0;

    public Tokenizer(String expressionString, ExpressionConfiguration configuration) {
        this.expressionString = expressionString;
    }

    public String getTokens() {
        return expressionString;
    }

    public String getToken() {
        if (tokenIndex < expressionString.length()) {
            return String.valueOf(expressionString.charAt(tokenIndex++));
        } else {
            return "";
        }
    }

    public String getOperators() {
        StringBuilder operators = new StringBuilder();
        while (tokenIndex < expressionString.length() && expressionString.charAt(tokenIndex) != ' ') {
            operators.append(expressionString.charAt(tokenIndex++));
        }
        tokenIndex++;
        if (operators.toString().equals("")) {
            return "";
        } else {
            return operators.toString();
        }
    }

    public String getFunctions() {
        StringBuilder functions = new StringBuilder();
        while (tokenIndex < expressionString.length() && expressionString.charAt(tokenIndex) != ' ') {
            functions.append(expressionString.charAt(tokenIndex++));
        }
        tokenIndex++;
        if (functions.toString().equals("")) {
            return "";
        } else {
            return functions.toString();
        }
    }

    public boolean equals(double value) {
        try {
            Double.parseDouble(this.getToken());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

public class TestExpressionConfiguration {

    @Test
    public void testGetFunctions() {
        String expressionString = "sin(x)";
        Tokenizer tokenizer = new Tokenizer(expressionString, null);
        assertEquals("s", tokenizer.getFunctions());
        tokenizer.getTokenIndex();
        assertTrue(tokenizer.equals(1.57));
        assertFalse(tokenizer.equals(2.0));
    }

}