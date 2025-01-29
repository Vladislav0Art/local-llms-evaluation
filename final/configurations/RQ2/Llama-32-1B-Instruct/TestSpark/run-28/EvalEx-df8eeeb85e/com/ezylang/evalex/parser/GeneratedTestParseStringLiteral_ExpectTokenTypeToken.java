package com.ezylang.evalex.parser;

public class GeneratedTestParseStringLiteral_ExpectTokenTypeToken {

    @Test
    public void testParseStringLiteral_ExpectTokenTypeToken() throws ParseException {
        String expressionString = "x";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc("x");
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();

        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();

        assertEquals(TokenType.TOKEN_TYPE_TOKEN, tokens.get(0).type());
    }

}