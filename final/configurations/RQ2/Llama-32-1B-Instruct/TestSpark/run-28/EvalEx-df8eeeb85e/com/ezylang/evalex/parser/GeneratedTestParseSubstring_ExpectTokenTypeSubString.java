package com.ezylang.evalex.parser;

public class GeneratedTestParseSubstring_ExpectTokenTypeSubString {

    @Test
    public void testParseSubstring_ExpectTokenTypeSubString() throws ParseException {
        String expressionString = "x.y";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc("x");
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();

        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();

        assertEquals(TokenType.TOKEN_TYPE_SUBSTRING, tokens.get(0).type());
    }

}