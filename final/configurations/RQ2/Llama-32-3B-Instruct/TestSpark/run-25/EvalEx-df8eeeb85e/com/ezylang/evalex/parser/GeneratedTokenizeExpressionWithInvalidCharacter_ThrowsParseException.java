package com.ezylang.evalex.parser;

public class GeneratedTokenizeExpressionWithInvalidCharacter_ThrowsParseException {

    @Test
    public void tokenizeExpressionWithInvalidCharacter_ThrowsParseException() {
        String expressionString = "1+";
        ParseException expectedException = new ParseException("Unexpected character: +");

        Tokenizer tokenizer = new Tokenizer(expressionString, ExpressionConfiguration.getStandardConfiguration());
        assertThrows(ParseException.class, expectedException::getClass);
    }

}