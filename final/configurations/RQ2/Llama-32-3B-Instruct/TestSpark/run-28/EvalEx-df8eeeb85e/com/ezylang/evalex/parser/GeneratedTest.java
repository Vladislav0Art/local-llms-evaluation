package com.ezylang.evalex.parser;

public class GeneratedTest {

    @Test
    public void constructor_WithExpressionAndConfiguration_ReturnsNewTokenizer() {
        // Given
        String expressionString = "1 + 2 * 3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();

        // When
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        // Then
        assertNotNull(tokenizer);
    }

    @Test
    public void parse_WithEmptyExpression_ReturnsEmptyList() {
        // Given
        String expressionString = "";
        ExpressionConfiguration configuration = new ExpressionConfiguration();

        // When
        List<Token> tokens = tokenizer.parse(expressionString, configuration);

        // Then
        assertTrue(tokens.isEmpty());
    }

    @Test
    public void parse_WithSingleLiteral_ReturnsCorrectToken() {
        // Given
        String expressionString = "1";
        ExpressionConfiguration configuration = new ExpressionConfiguration();

        // When
        List<Token> tokens = tokenizer.parse(expressionString, configuration);

        // Then
        assertEquals(1, tokens.size());
        assertTrue(tokens.get(0).type == TokenType.LITERAL);
    }

    @Test
    public void parse_WithMultipleLiterals_ReturnsCorrectTokens() {
        // Given
        String expressionString = "1 2 3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();

        // When
        List<Token> tokens = tokenizer.parse(expressionString, configuration);

        // Then
        assertEquals(3, tokens.size());
        assertTrue(tokens.get(0).type == TokenType.LITERAL);
        assertTrue(tokens.get(1).type == TokenType.LITERAL);
        assertTrue(tokens.get(2).type == TokenType.LITERAL);
    }

    @Test
    public void parse_WithOperators_ReturnsCorrectTokens() {
        // Given
        String expressionString = "1 + 2 * 3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();

        // When
        List<Token> tokens = tokenizer.parse(expressionString, configuration);

        // Then
        assertEquals(4, tokens.size());
        assertTrue(tokens.get(0).type == TokenType.LITERAL);
        assertTrue(tokens.get(1).type == TokenType.OPERATOR);
        assertTrue(tokens.get(2).type == TokenType.LITERAL);
        assertTrue(tokens.get(3).type == TokenType.OPERATOR);
    }

    @Test
    public void parseStringLiteral_WithLiteral_ReturnsCorrectToken() {
        // Given
        String literal = "1";
        Tokenizer tokenizer = new Tokenizer(literal, new ExpressionConfiguration());

        // When
        Token token = tokenizer.parseStringLiteral();

        // Then
        assertEquals(1, token.value);
        assertTrue(token.type == TokenType.LITERAL);
    }

    @Test
    public void parseStringLiteral_WithOperator_ReturnsCorrectToken() {
        // Given
        String expressionString = "1 +";
        Tokenizer tokenizer = new Tokenizer(expressionString, new ExpressionConfiguration());

        // When
        Token token = tokenizer.parseStringLiteral();

        // Then
        assertTrue(token.type == TokenType.OPERATOR);
    }

    @Test
    public void parseStringLiteral_WithInvalidExpression_ReturnsParseException() {
        // Given
        String expressionString = "1 +";
        ExpressionConfiguration configuration = new ExpressionConfiguration();

        // When and Then
        try {
            tokenizer.parseStringLiteral();
            assert false;
        } catch (ParseException e) {
            assertTrue(true);
        }
    }

}