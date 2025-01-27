package com.ezylang.evalex.parser;

public class GeneratedTestTokenizer_parseExpressionWithFunction_ReturnsListTokensCorrectly {

    @Test
    public void testTokenizer_parseExpressionWithFunction_ReturnsListTokensCorrectly() {
        String expressionString = "SIN(1.5)";
        FunctionIfc function = new FunctionIfcImpl(1.5, "SIN");
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new Token(TokenType.FUNCTION, "SIN"));
        expectedTokens.add(new Token(TokenType.NUMBER, "1.5"));

        Tokenizer tokenizer = new Tokenizer(expressionString, ExpressionConfiguration.getStandardConfiguration());
        List<Token> actualTokens = tokenizer.parse();

        assertEquals(expectedTokens, actualTokens);
    }

}