package com.ezylang.evalex.parser;

public class GeneratedTest_parse_function_call {

    private String expressionString;
    private ExpressionConfiguration configuration;

    @Mock
    private TokenType tokenType;

    @InjectMocks
    private Tokenizer instance;

    @Test
    public void test_parse_function_call() throws ParseException {
        // Arrange
        tokenType = mock(TokenType.class);
        when(tokenType.getType("function call")).thenReturn(TokenType.FUNCTION_CALL);

        expressionString = "foo.bar(1, 2)";
        configuration = new ExpressionConfiguration();

        // Act
        List<Token> tokens = instance.parse().getTokens();

        // Assert
    }

}