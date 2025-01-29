package com.ezylang.evalex.parser;

public class GeneratedTestParseExpression {

    private Tokenizer tokenizer;

    @Before
    public void setup() {
        String expressionString = "1 + 2";
        ExpressionConfiguration configuration = new DefaultExpressionConfiguration();
        tokenizer = new Tokenizer(expressionString, configuration);
    }

    @Test
    public void testParseExpression() {
        String expressionString = "(1 + 2)";
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new LeftParenthesisToken("("));
        expectedTokens.add(new BinaryPlusToken(" + ", 2));
        expectedTokens.add(new NumberToken(1));
        expectedTokens.add(new RightParenthesisToken(")"));
        assertEquals(expectedTokens, tokenizer.parseExpression(expressionString));
    }

}