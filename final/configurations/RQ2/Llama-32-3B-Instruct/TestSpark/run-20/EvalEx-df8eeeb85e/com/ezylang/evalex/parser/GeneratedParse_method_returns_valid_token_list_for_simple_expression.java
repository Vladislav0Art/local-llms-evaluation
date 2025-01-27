package com.ezylang.evalex.parser;

@RunWith(JUnit4.class)
public class GeneratedParse_method_returns_valid_token_list_for_simple_expression {

    @RunWith(JUnit4.class)
    public static class TestTokenizerCreationWithValidExpressionStringAndConfigurationDoesNotThrowException extends BaseTest {

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

    }