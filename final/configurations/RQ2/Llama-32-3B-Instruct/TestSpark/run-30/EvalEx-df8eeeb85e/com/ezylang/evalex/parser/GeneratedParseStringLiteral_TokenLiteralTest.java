package com.ezylang.evalex.parser;

public class GeneratedParseStringLiteral_TokenLiteralTest {

    @Test
    public void parseStringLiteral_TokenLiteralTest() throws ParseException {
        String expressionString = "hello";
        Tokenizer tokenizer = new Tokenizer(expressionString, ExpressionConfiguration.valid());
        Token token = tokenizer.parseStringLiteral();
        assertEquals(LITERAL, token.getType());
        assertNotNull(token.getValue());
    }

}