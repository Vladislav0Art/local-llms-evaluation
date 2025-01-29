package com.ezylang.evalex.parser;

public class GeneratedTest_parse_string_literal_empty {

    private String expressionString;
    private ExpressionConfiguration configuration;

    @Mock
    private TokenType tokenType;

    @InjectMocks
    private Tokenizer instance;

    @Test
    public void test_parse_string_literal_empty() throws ParseException {
        // Arrange
        tokenType = mock(TokenType.class);
        when(tokenType.getType("string literal")).thenReturn(TokenType.STRING_LITERAL);

        expressionString = "";
        configuration = new ExpressionConfiguration();

        // Act
        List<Token> tokens = instance.parse().getTokens();

        // Assert
        assertEquals(1, tokens.size());
    }

}