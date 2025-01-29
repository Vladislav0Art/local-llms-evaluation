package com.ezylang.evalex.parser;

import com.ezylang.evalex.functions.FunctionIfc;

public class GeneratedTestGetExpressionConfiguration {

    private ExpressionConfiguration configuration = new ExpressionConfiguration();

    @Before
    public void setup() {
        System.out.println(configuration);
    }

    @After
    public void tearDown() {
        // Do nothing
    }

    @Test
    public void testGetExpressionConfiguration() {
        assertNotNull(this.configuration);
    }

}