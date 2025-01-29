package com.ezylang.evalex.parser;

public class GeneratedTestParseFunctionDefinition {

    private ExpressionConfiguration configuration = new ExpressionConfiguration();
    private FunctionDictionaryIfc functionDictionary;
    private OperatorDictionaryIfc operatorDictionary;

    @Test
    public void TestParseFunctionDefinition() throws ParseException {
        // Arrange
        String expressionString = "function a(b) { return a + b; }";
        ExpressionConfiguration expectedConfiguration = new ExpressionConfiguration();
        expectedConfiguration.addFunction("a", functionDictionary);

        // Act
        List<Token> actual = parse(expressionString);

        // Assert
        assertEquals(expectedConfiguration, actual.getFunctions().get("a"));
    }

}