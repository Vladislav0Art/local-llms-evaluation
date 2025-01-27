package com.ezylang.evalex.parser;

@RunWith(JUnit4.class)
public class GeneratedParse_string_literal_method_returns_valid_token_with_literal_value {

    @RunWith(JUnit4.class)
    public static class TestTokenizerCreationWithValidExpressionStringAndConfigurationDoesNotThrowException extends BaseTest {

        @Test
        public void parse_string_literal_method_returns_valid_token_with_literal_value() throws ParseException {
            // Given
            String expressionString = "\"hello\"";
            ExpressionConfiguration configuration = new ExpressionConfiguration();
            OperatorDictionaryIfc operatorDictionary = new OperatorDictionaryIfc();

            // When
            Token token = tokenizer(expressionString, configuration).parseStringLiteral();

            // Then
            assert token != null;
        }

    }