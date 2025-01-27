package com.ezylang.evalex.parser;

public class GeneratedParseStringLiteral_TokenNotLiteralTest {

    @Test
    public void parseStringLiteral_TokenNotLiteralTest() throws ParseException {
        String expressionString = "hello";
        Tokenizer tokenizer = new Tokenizer(expressionString, ExpressionConfiguration.valid());
        assertThrows(ParseException.class, () -> tokenizer.parseStringLiteral());
    }

}