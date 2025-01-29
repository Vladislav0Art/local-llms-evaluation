package com.ezylang.evalex.parser;

public class GeneratedTestParseExpressionWithParentheses {

    private ExpressionConfiguration configuration = new ExpressionConfiguration();
    private FunctionDictionaryIfc functionDictionary;
    private OperatorDictionaryIfc operatorDictionary;

    @Test
    public void TestParseExpressionWithParentheses() throws ParseException {
        // Arrange
        String expressionString = "(1 + 2) * b";
        List<Token> expected = new ArrayList<>();
        expected.add(new Token(TokenType.LEFT_PAREN, 0));
        expected.add(new Token(TokenType.ID, 4));
        expected.add(new Token(TokenType.RIGHT_PAREN, 7));

        // Act
        List<Token> actual = parse(expressionString);

        // Assert
        assertEquals(expected, actual);
    }

}