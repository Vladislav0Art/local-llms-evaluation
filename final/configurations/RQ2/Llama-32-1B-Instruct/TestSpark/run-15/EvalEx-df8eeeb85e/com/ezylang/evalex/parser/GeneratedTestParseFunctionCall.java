package com.ezylang.evalex.parser;

import com.ezylang.evalex.functions.FunctionIfc;

public class GeneratedTestParseFunctionCall {

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
    public void testParseFunctionCall() throws ParseException {
        String expressionString = "(x + 1)";
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(parseFunctionCall(0, expressionString));
        assertEquals(expectedTokens, parse(expressionString));
    }

}