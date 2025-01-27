package com.ezylang.evalex.parser;

public class GeneratedConstructorTest_ExpressionValid {

    @Test
    public void constructorTest_ExpressionValid() {
        String expressionString = "1 + 2 * 3";
        Tokenizer tokenizer = new Tokenizer(expressionString, ExpressionConfiguration.valid());
        assertNotNull(tokenizer);
        assertEquals(1, tokenizer.parse().size());
    }

}