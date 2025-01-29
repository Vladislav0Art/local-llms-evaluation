package com.ezylang.evalex.parser;

public class GeneratedTestParseOperatorWithMultipleArguments {

    private ExpressionConfiguration configuration = new ExpressionConfiguration();
    private FunctionDictionaryIfc functionDictionary;
    private OperatorDictionaryIfc operatorDictionary;

    @Test
    public void TestParseOperatorWithMultipleArguments() throws ParseException {
        // Arrange
        String expressionString = "a + b.c";
        List<Token> expected = new ArrayList<>();
        expected.add(new Token(TokenType.LEFT_PAREN, 0));
        expected.add(new Token(TokenType.AND, 3));
        expected.add(new Token(TokenType.LEFT_PAREN, 7));
        expected.add(new Token(TokenType.ID, 11));
        expected.add(new Token(TokenType.RIGHT_PAREN, 14));

        // Act
        List<Token> actual = parse(expressionString);

        // Assert
        assertEquals(expected, actual);
    }

}