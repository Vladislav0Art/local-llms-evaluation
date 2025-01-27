package com.ezylang.evalex.parser;

public class GeneratedGivenExpressionStringWithInvalidCharacterParseExceptionTest {

    @Test
    public void givenExpressionStringWithInvalidCharacterParseExceptionTest() {
        // Arrange
        String expressionString = "hello $ world";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        configuration.setFunctionDictionaryIfc(new FunctionDictionaryIfc());
        configuration.setOperatorDictionaryIfc(new OperatorDictionaryIfc());

        // Act and Assert
        try {
            Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
            tokenizer.parse();
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertEquals("Invalid character", e.getMessage());
        }
    }

}