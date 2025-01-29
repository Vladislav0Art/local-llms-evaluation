package com.ezylang.evalex.parser;

public class GeneratedTestParseToken_ExpectEmptyListForKeyword {

    @Test
    public void testParseToken_ExpectEmptyListForKeyword() {
        String expressionString = "x";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        KeywordDictionaryIfc dictionary = new KeywordDictionaryIfc("x");

        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();

        assertEquals(0, tokens.size());
    }

}