package com.ezylang.evalex.parser;

public class GeneratedTestParseParentheses {

    private Tokenizer tokenizer;

    @Before
    public void setup() {
        String expressionString = "1 + 2";
        ExpressionConfiguration configuration = new DefaultExpressionConfiguration();
        tokenizer = new Tokenizer(expressionString, configuration);
    }

    @Test
    public void testParseParentheses() {
        String expressionString = "(1)";
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new LeftParenthesisToken("("));
        expectedTokens.add(new NumberToken(1));
        expectedTokens.add(new RightParenthesisToken(")"));
        assertEquals(expectedTokens, tokenizer.parseParentheses(expressionString));
    }

}