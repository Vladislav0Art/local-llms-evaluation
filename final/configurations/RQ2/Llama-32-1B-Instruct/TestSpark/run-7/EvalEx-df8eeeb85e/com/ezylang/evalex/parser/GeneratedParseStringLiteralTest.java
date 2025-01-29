package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseStringLiteralTest {

    @Test
    public void ParseStringLiteralTest() throws ParseException {
        // Create a mock expression string and configuration
        String expressionStringMock = "123";
        ExpressionConfiguration configurationMock = new ExpressionConfiguration();

        // Create a mock parser instance
        Parser parserMock = MockParser.getInstance();
        parserMock.setExpressionString(expressionStringMock);
        parserMock.setConfiguration(configurationMock);

        // Parse the string literal using the mock parser and tokenizer
        List<Token> tokensMock = parserMock.parseTokenizers()[0].parseStringLiteral();

        // Assert that the parse method returns the correct token
        assert tokensMock.size() == 1;
    }

}