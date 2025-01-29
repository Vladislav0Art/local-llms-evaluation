package com.ezylang.evalex.parser;

public class Generated[MethodUnderTest]

ParseStringLiteralTokenTest {

    @Test
    public void [MethodUnderTest]ParseStringLiteralTokenTest() throws ParseException {
        // Create a mock expression string and configuration
        String expressionStringMock = "123";
        ExpressionConfiguration configurationMock = new ExpressionConfiguration();

        // Create a mock parser instance
        Parser parserMock = MockParser.getInstance();
        parserMock.setExpressionString(expressionStringMock);
        parserMock.setConfiguration(configurationMock);

        // Parse the string literal using the mock parser and tokenizer
        Token[] tokens = parserMock.parseTokenizers()[0].parseStringLiteral();

        // Assert that the parse method returns the correct token
        assert tokens[0] == parseStringLiteralToken();
    }

    public List<Token> parse () throws ParseException {
        return parseStringLiteral();
    }

}