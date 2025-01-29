package com.ezylang.evalex.parser;

public class GeneratedTestParseExpression {

    private ExpressionConfiguration configuration = new ExpressionConfiguration();
    private FunctionDictionaryIfc functionDictionary;
    private OperatorDictionaryIfc operatorDictionary;

    @Test
    public void TestParseExpression() throws ParseException {
        // Arrange
        String expressionString = "a + b";
        List<Token> expected = new ArrayList<>();
        expected.add(new Token(TokenType.LEFT_PAREN, 0));
        expected.add(new Token(TokenType.AND, 3));
        expected.add(new Token(TokenType.RIGHT_PAREN, 6));

        // Act
        List<Token> actual = parse(expressionString);

        // Assert
        assertEquals(expected, actual);
    }

}