package com.ezylang.evalex.parser;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTest {

    private Expression parseExpression(String expression) {
        return parse(expression);
    }

    @Before
    public void setup() {
        this.expressionString = "1 + 2 * (3 - 4)";
    }

}