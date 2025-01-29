package com.ezylang.evalex.parser;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestParseTokenType_Byte {

    private Tokenizer tokenizer;

    @Before
    public void setup() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        String expressionString = "1 + 2";
        tokenizer = new Tokenizer(expressionString, configuration);
    }

    @Test
    public void testParseTokenType_Byte() {
        assertEquals(Type.BYTE, tokenizer.getByte().getType());
    }

}