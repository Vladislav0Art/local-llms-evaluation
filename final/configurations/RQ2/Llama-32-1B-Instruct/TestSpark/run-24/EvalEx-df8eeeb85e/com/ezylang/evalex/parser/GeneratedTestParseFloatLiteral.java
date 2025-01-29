package com.ezylang.evalex.parser;

public class GeneratedTestParseFloatLiteral {

    private Tokenizer tokenizer;

    @Before
    public void setup() {
        String expressionString = "1 + 2";
        ExpressionConfiguration configuration = new DefaultExpressionConfiguration();
        tokenizer = new Tokenizer(expressionString, configuration);
    }

    @Test
    public void testParseFloatLiteral() {
        String expressionString = "123.456";
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new FloatNumberToken(123.456));
        assertEquals(expectedTokens, tokenizer.parseFloatLiteral(expressionString));
    }

}