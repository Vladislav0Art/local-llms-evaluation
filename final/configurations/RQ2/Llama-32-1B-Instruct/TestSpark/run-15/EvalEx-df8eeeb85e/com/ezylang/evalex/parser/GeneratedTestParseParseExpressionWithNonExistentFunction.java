package com.ezylang.evalex.parser;

public class GeneratedTestParseParseExpressionWithNonExistentFunction {

    private ExpressionConfiguration configuration;

    @Test
    public void testParseParseExpressionWithNonExistentFunction() throws ParseException {
        String expressionString = "42";
        List<Token> expectedTokens = new ArrayList<>();
        assertEquals(expectedTokens, parse(expressionString));
    }

}