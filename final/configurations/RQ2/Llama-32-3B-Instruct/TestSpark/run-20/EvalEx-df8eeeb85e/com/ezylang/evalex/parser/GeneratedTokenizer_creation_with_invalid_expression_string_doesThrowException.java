package com.ezylang.evalex.parser;

@RunWith(JUnit4.class)
public class GeneratedTokenizer_creation_with_invalid_expression_string_doesThrowException {

    @RunWith(JUnit4.class)
    public static class TestTokenizerCreationWithValidExpressionStringAndConfigurationDoesNotThrowException extends BaseTest {

        @Test
        public void tokenizer_creation_with_invalid_expression_string_doesThrowException() {
            // Given
            String expressionString = "invalid";
            ExpressionConfiguration configuration = new ExpressionConfiguration();

            // When and Then
            assertThrows(ParseException.class, () -> tokenizer(expressionString, configuration));
        }
    }

}