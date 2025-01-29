package com.ezylang.evalex.parser;

public class GeneratedTest {

    private String expressionString;
    private ExpressionConfiguration configuration;

    @Mock
    private TokenType tokenType;

    @InjectMocks
    private Tokenizer instance;

    @Test
    public void test_parse() throws ParseException {
        // Arrange
        when(tokenType.getType("string literal")).thenReturn(TokenType.STRING_LITERAL);
        expressionString = "123";
        configuration = new ExpressionConfiguration();

        // Act
        List<Token> tokens = instance.parse().getTokens();

        // Assert
        assertEquals(1, tokens.size());
    }

    @Test
    public void test_parse_string_literal() throws ParseException {
        // Arrange
        tokenType = mock(TokenType.class);
        when(tokenType.getType("string literal")).thenReturn(TokenType.STRING_LITERAL);

        expressionString = "123";
        configuration = new ExpressionConfiguration();

        // Act
        List<Token> tokens = instance.parse().getTokens();

        // Assert
        assertEquals(1, tokens.size());
    }

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

    @Test
    public void test_parse_string_literal() throws ParseException {
        // Arrange
        tokenType = mock(TokenType.class);
        when(tokenType.getType("string literal")).thenReturn(TokenType.STRING_LITERAL);

        expressionString = "123";
        configuration = new ExpressionConfiguration();

        // Act
        List<Token> tokens = instance.parse().getTokens();

        // Assert
    }

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