package com.ezylang.evalex.parser;

public class GeneratedTestParseStringLiteral {

    private ExpressionConfiguration configuration = new ExpressionConfiguration();
    private FunctionDictionaryIfc functionDictionary;
    private OperatorDictionaryIfc operatorDictionary;

    @Test
    public void TestParseStringLiteral() throws ParseException {
        // Arrange
        String expressionString = "1";
        List<Token> expected = new ArrayList<>();
        expected.add(new Token(TokenType.WHITE_SPACE, 0));
        expected.add(new Token(TokenType.NUMBER, 5));

        // Act
        List<Token> actual = parseStringLiteral(expressionString);

        // Assert
        assertEquals(expected, actual);
    }

}