package com.ezylang.evalex.parser;

public class GeneratedTestParseStringLiteral_SingleWordToken_ThrowsParseException {

    @Test
    public void testParseStringLiteral_SingleWordToken_ThrowsParseException() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();

        // Arrange
        String expression = "test";
        Tokenizer tokenizer = new Tokenizer(expression, configuration);

        // Act and Assert
        try {
            tokenizer.parseStringLiteral();
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
            // Expected behavior: ParseException is thrown when parsing a single word token.
            assertEquals(TokenType.WORD, e.getType());
        }
    }

}