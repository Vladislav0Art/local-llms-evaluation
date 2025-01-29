package com.ezylang.evalex.parser;

public class GeneratedTest_parse {

    private String expressionString;
    private ExpressionConfiguration configuration;

    @Mock
    private TokenType tokenType;

    @InjectMocks
    private Tokenizer instance;

    @Test
    public void test_parse() throws ParseException {
        // Arrange
        tokenType = mock(TokenType.class);
        when(tokenType.getType("string literal")).thenReturn(TokenType.STRING_LITERAL);
        expressionString = "123";
        configuration = new ExpressionConfiguration();

        // Act
        List<Token> tokens = instance.parse().getTokens();

        // Assert
    }

}