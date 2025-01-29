package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestParseStringLiteral {

    @Test
    public void testParseStringLiteral() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc functionDictionary = new FunctionDictionaryIfc();

        Parser parser = new Parser(expressionString, configuration);
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        tokenizer.parseStringLiteral();
        assertEquals("1", resultTokens.get(0).getType());
    }

}