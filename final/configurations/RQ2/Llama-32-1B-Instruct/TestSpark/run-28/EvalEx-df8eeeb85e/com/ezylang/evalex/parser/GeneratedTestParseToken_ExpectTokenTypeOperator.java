package com.ezylang.evalex.parser;

public class GeneratedTestParseToken_ExpectTokenTypeOperator {

    @Test
    public void testParseToken_ExpectTokenTypeOperator() {
        String expressionString = "x";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc("x");
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();

        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();

        assertEquals(TokenType.TOKEN_TYPE_OPERATOR, tokens.get(0).type());
    }

}