package com.ezylang.evalex.parser;

@RunWith(JUnit4.class)
public class GeneratedParse_method_returns_empty_token_list_for_empty_expression_string {

    @RunWith(JUnit4.class)
    public static class TestTokenizerCreationWithValidExpressionStringAndConfigurationDoesNotThrowException extends BaseTest {

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

}