package com.ezylang.evalex.parser;

public class GeneratedTestParseExpressionWithVariablesAndArithmeticOperations {

    private ExpressionConfiguration configuration = new ExpressionConfiguration();
    private FunctionDictionaryIfc functionDictionary;
    private OperatorDictionaryIfc operatorDictionary;

    @Test
    public void TestParseExpressionWithVariablesAndArithmeticOperations() throws ParseException {
        // Arrange
        String expressionString = "a + b AND c OR (d * e)";
        List<Token> expected = new ArrayList<>();
        expected.add(new Token(TokenType.LEFT_PAREN, 0));
        expected.add(new Token(TokenType.ID, 5));
        expected.add(new Token(TokenType.RIGHT_PAREN, 8));

        // Act
        List<Token> actual = parse(expressionString);

        // Assert
        assertEquals(expected, actual);
    }

}