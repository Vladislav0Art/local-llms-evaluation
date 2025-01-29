package com.ezylang.evalex.parser;

import com.ezylang.evalex.functions.FunctionIfc;

public class GeneratedTestParseExpressionWithNonExistentFunction {

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
    public void testParseExpressionWithNonExistentFunction() throws ParseException {
        String expressionString = "42";
        List<Token> expectedTokens = new ArrayList<>();
        assertEquals(expectedTokens, parse(expressionString));
    }

}