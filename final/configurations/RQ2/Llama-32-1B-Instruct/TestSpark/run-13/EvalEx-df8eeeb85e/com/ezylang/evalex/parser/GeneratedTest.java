package com.ezylang.evalex.parser;

import com.ezylang.evalex.functions.FunctionIfc;

public class GeneratedTest {

    private String expressionString = "1 + 2";

    @Test
    public void testParseStringLiteral() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc functionDict = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(3, tokens.size());
        assertEquals(TokenType.STRING_LITERAL, tokens.get(0).getType());
        assertEquals("1", tokens.get(0).getValue());
    }

    @Test
    public void testParseInvalidExpression() {
        FunctionDictionaryIfc functionDict = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();
        Tokenizer tokenizer = new Tokenizer(expressionString, functionDict, operatorDict);
        List<Token> tokens = tokenizer.parse();
        assertNotNull(tokens);
    }

    @Test
    public void testParseInvalidConfiguration() {
        FunctionDictionaryIfc functionDict = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();
        Tokenizer tokenizer = new Tokenizer(expressionString, functionDict, operatorDict);
        List<Token> tokens = tokenizer.parse();
        assertNull(tokens);
    }

    @Test
    public void testParseToken() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc functionDict = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(2, tokens.size());
    }
}

@Test
public void testParseInvalidExpressionWithNoToken() {
    ExpressionConfiguration configuration = new ExpressionConfiguration();
    FunctionDictionaryIfc functionDict = new FunctionDictionaryIfc();
    OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();
    Tokenizer tokenizer = new Tokenizer(expressionString, functionDict, operatorDict);
    List<Token> tokens = tokenizer.parse();
    assertNull(tokens);
}
	}

            }