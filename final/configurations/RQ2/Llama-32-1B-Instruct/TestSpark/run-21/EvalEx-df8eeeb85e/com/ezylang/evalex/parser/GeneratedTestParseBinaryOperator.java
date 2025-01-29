package com.ezylang.evalex.parser;

public class GeneratedTestParseBinaryOperator {

    @Test
    public void testParseBinaryOperator() throws ParseException {
        String expressionString = "5 + 2";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());
        assertTrue(tokens.get(0) instanceof BinaryOperatorToken);
    }

}