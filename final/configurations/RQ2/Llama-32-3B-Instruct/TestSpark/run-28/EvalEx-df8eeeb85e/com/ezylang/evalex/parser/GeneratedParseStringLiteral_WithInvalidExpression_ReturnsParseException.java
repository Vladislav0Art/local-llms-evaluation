package com.ezylang.evalex.parser;

public class GeneratedParseStringLiteral_WithInvalidExpression_ReturnsParseException {

    @Test
    public void parseStringLiteral_WithInvalidExpression_ReturnsParseException() {
        // Given
        String expressionString = "1 +";
        ExpressionConfiguration configuration = new ExpressionConfiguration();

        // When and Then
        try {
            tokenizer.parseStringLiteral();
            assert false;
        } catch (ParseException e) {
            assertTrue(true);
        }
    }

}