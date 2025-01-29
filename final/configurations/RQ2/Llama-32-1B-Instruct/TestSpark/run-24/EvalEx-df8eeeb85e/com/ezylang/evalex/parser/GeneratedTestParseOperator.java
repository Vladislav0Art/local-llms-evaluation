package com.ezylang.evalex.parser;

public class GeneratedTestParseOperator {

    private Tokenizer tokenizer;

    @Before
    public void setup() {
        String expressionString = "1 + 2";
        ExpressionConfiguration configuration = new DefaultExpressionConfiguration();
        tokenizer = new Tokenizer(expressionString, configuration);
    }

    @Test
    public void testParseOperator() {
        String expressionString = "+";
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new OperatorToken("+", " + "));
        assertEquals(expectedTokens, tokenizer.parseOperator(expressionString));
    }

}