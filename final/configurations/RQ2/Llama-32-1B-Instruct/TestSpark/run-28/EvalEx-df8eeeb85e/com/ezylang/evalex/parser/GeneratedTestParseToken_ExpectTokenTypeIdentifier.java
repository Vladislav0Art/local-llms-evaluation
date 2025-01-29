package com.ezylang.evalex.parser;

public class GeneratedTestParseToken_ExpectTokenTypeIdentifier {

    @Test
    public void testParseToken_ExpectTokenTypeIdentifier() {
        String expressionString = "x";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        IdentifierDictionaryIfc dictionary = new IdentifierDictionaryIfc("x");

        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();

        assertEquals(TokenType.TOKEN_TYPE_IDENTIFIER, tokens.get(0).type());
    }

}