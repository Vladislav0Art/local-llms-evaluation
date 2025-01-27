package com.ezylang.evalex.parser;

@RunWith(JUnit4.class)
public class GeneratedTokenizer_creation_with_valid_expression_string_and_configuration_doesNotThrowException {

    @RunWith(JUnit4.class)
    public static class TestTokenizerCreationWithValidExpressionStringAndConfigurationDoesNotThrowException extends BaseTest {

        @Test
        public void tokenizer_creation_with_valid_expression_string_and_configuration_doesNotThrowException() {
            // Given
            String expressionString = "1 + 2 * 3";
            ExpressionConfiguration configuration = new ExpressionConfiguration();

            // When and Then
            assert tokenizer(expressionString, configuration) != null;
        }

    }