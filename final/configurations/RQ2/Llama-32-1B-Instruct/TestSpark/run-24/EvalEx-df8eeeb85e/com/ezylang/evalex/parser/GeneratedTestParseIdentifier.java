package com.ezylang.evalex.parser;

public class GeneratedTestParseIdentifier {

    private Tokenizer tokenizer;

    @Before
    public void setup() {
        String expressionString = "1 + 2";
        ExpressionConfiguration configuration = new DefaultExpressionConfiguration();
        tokenizer = new Tokenizer(expressionString, configuration);
    }

    @Test
    public void testParseIdentifier() {
        String expressionString = "_x";
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new IdentifierToken("_x"));
        assertEquals(expectedTokens, tokenizer.parseIdentifier(expressionString));
    }

}