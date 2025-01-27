package com.ezylang.evalex.parser;

@RunWith(JUnit4.class)
public class GeneratedTest {

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

        @Test
        public void tokenizer_creation_with_invalid_expression_string_doesThrowException() {
            // Given
            String expressionString = "invalid";
            ExpressionConfiguration configuration = new ExpressionConfiguration();

            // When and Then
            assertThrows(ParseException.class, () -> tokenizer(expressionString, configuration));
        }
    }

    @Test
    public void parse_method_returns_valid_token_list_for_simple_expression() throws ParseException {
        // Given
        String expressionString = "1 + 2";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        OperatorDictionaryIfc operatorDictionary = new OperatorDictionaryIfc();

        // When
        List<Token> tokenList = tokenizer(expressionString, configuration).parse();

        // Then
        assert !tokenList.isEmpty();
    }

    @Test
    public void parse_method_returns_empty_token_list_for_empty_expression_string() throws ParseException {
        // Given
        String expressionString = "";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        OperatorDictionaryIfc operatorDictionary = new OperatorDictionaryIfc();

        // When
        List<Token> tokenList = tokenizer(expressionString, configuration).parse();

        // Then
        assert tokenList.isEmpty();
    }
}

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

@Test
public void parse_string_literal_method_returns_valid_token_with_quote_characters() throws ParseException {
    // Given
    String expressionString = "\"hello\"\\\"";
    ExpressionConfiguration configuration = new ExpressionConfiguration();
    OperatorDictionaryIfc operatorDictionary = new OperatorDictionaryIfc();

    // When
    Token token = tokenizer(expressionString, configuration).parseStringLiteral();

    // Then
    assert token != null;
}
		}

                }

class BaseTest {

    public static Tokenizer tokenizer(String expressionString, ExpressionConfiguration configuration) {
        return new Tokenizer(expressionString, configuration);
    }

}