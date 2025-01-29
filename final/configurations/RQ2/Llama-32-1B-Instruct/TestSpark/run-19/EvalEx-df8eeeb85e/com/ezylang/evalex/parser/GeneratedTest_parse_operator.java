package com.ezylang.evalex.parser;

public class GeneratedTest_parse_operator {

    private String expressionString;
    private ExpressionConfiguration configuration;

    @Mock
    private TokenType tokenType;

    @InjectMocks
    private Tokenizer instance;

    @Test
    public void test_parse_operator() throws ParseException {
        // Arrange
        tokenType = mock(TokenType.class);
        when(tokenType.getType("operator")).thenReturn(TokenType.OPERATOR);

        expressionString = "foo < bar";
        configuration = new ExpressionConfiguration();

        // Act
        List<Token> tokens = instance.parse().getTokens();

        // Assert
    }

}