package com.ezylang.evalex.parser;

public class GeneratedTestParseToken_ExpectEmptyListForIdentifier {

    @Test
    public void testParseToken_ExpectEmptyListForIdentifier() {
        String expressionString = "x";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        IdentifierDictionaryIfc dictionary = new IdentifierDictionaryIfc("x");

        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();

        assertEquals(0, tokens.size());
    }

}