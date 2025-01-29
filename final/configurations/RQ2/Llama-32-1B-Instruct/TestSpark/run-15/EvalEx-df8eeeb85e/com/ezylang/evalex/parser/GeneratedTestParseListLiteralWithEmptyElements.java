package com.ezylang.evalex.parser;

import com.ezylang.evalex.functions.FunctionIfc;

public class GeneratedTestParseListLiteralWithEmptyElements {

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
    public void testParseListLiteralWithEmptyElements() throws ParseException {
        String expressionString = "[]";
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(parseListLiteral(0, expressionString));
        assertEquals(expectedTokens, parse(expressionString));
    }

}