package com.ezylang.evalex.parser;

public class GeneratedTestParseExpressionWithMultipleFunctions {

    private ExpressionConfiguration configuration = new ExpressionConfiguration();
    private FunctionDictionaryIfc functionDictionary;
    private OperatorDictionaryIfc operatorDictionary;

    @Test
    public void TestParseExpressionWithMultipleFunctions() throws ParseException {
        // Arrange
        String expressionString = "function a(b) { return a + b; } function c(d) { return c + d; }";
        ExpressionConfiguration expectedConfiguration = new ExpressionConfiguration();
        expectedConfiguration.addFunction("a", functionDictionary);
        expectedConfiguration.addFunction("c", functionDictionary);

        // Act
        List<Token> actual = parse(expressionString);

        // Assert
        assertEquals(expectedConfiguration, actual.getFunctions().get("a"));
        assertEquals(expectedConfiguration, actual.getFunctions().get("c"));
    }

}