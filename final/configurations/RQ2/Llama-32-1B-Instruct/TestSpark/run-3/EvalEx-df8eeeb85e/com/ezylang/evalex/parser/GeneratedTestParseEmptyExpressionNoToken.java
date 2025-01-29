package com.ezylang.evalex.parser;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestParseEmptyExpressionNoToken {

    private Expression parse();

    private String expressionString;
    private List<Token> expectedTokens;

    @Before
    public void setup() {
        this.expressionString = "1 + 2 * (3 - 4)";
        this.expectedTokens = new ArrayList<>();
    }

    @Test
    public void testParseEmptyExpressionNoToken() {
        when(expressionString).thenReturn("1 + 2 * (3 - 4)");
        List<Token> result = parse();
        expectedTokens.forEach(token -> result.removeIf(t -> t instanceof Token));
    }

}