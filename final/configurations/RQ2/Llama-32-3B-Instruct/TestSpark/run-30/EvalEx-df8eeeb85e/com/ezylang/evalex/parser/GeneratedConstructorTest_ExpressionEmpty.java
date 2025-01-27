package com.ezylang.evalex.parser;

public class GeneratedConstructorTest_ExpressionEmpty {

    @Test
    public void constructorTest_ExpressionEmpty() {
        assertThrows(ParseException.class, () -> new Tokenizer("", ExpressionConfiguration.empty()));
    }

}