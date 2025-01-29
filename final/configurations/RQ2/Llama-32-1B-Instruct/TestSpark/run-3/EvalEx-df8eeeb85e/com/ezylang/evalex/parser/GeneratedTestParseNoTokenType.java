package com.ezylang.evalex.parser;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestParseNoTokenType {

    private Expression parse();

    private String expressionString;
    private List<Token> expectedTokens;

    @Before
    public void setup() {
        this.expressionString = "1 + 2 * (3 - 4)";
        this.expectedTokens = new ArrayList<>();
    }

    @Test
    public void testParseNoTokenType() {
        when(expressionString).thenReturn("a");
        parse().stream().collect(Collectors.toList()).forEach(token -> expectedTokens.add(token));
    }

}