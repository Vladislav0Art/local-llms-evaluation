package com.ezylang.evalex.parser;

public class GeneratedTestParseStringLiteral {

    private ExpressionConfiguration configuration;

    @Test
    public void testParseStringLiteral() throws ParseException {
        String expressionString = "42";
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(parseStringLiteral(0, expressionString));
        assertEquals(expectedTokens, parseStringLiteral());
    }

}