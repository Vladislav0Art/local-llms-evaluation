package com.ezylang.evalex.parser;

public class GeneratedParseMethod_TokenFunctionTest {

    @Test
    public void parseMethod_TokenFunctionTest() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("abs(1)", ExpressionConfiguration.valid());
        List<Token> tokens = tokenizer.parse();
        assertEquals(2, tokens.size());
    }

}