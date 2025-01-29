package com.ezylang.evalex.parser;

public class GeneratedTestParseToken_ExpectTokenTypeKeyword {

    @Test
    public void testParseToken_ExpectTokenTypeKeyword() {
        String expressionString = "x";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc("x");
        KeywordDictionaryIfc keywordDict = new KeywordDictionaryIfc("x");

        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();

        assertEquals(TokenType.TOKEN_TYPE_KEYWORD, tokens.get(0).type());
    }

}