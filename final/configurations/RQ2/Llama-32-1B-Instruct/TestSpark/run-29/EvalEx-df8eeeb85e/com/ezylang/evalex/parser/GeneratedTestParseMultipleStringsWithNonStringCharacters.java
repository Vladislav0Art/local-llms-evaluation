package com.ezylang.evalex.parser;

public class GeneratedTestParseMultipleStringsWithNonStringCharacters {

    @Test
    public void testParseMultipleStringsWithNonStringCharacters() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();

        String expression = "\"!@#$%^&*()_+\" \"string\"  \"";
        Tokenizer tokenizer = new Tokenizer(expression, configuration);

        List<Token> tokens = tokenizer.parseMultipleStringsWithNonStringCharacters();
        assertEquals(3, tokens.size());
        assertEquals(TokenType.WORD, tokens.get(0).getType());
        assertEquals(TokenType.WORD, tokens.get(1).getType());
        assertEquals(TokenType.WORD, tokens.get(2).getType());
    }

}