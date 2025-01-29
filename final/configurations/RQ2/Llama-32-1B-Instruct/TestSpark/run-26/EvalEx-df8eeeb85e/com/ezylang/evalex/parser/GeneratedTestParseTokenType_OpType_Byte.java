package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Token.Type;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestParseTokenType_OpType_Byte {

    private Tokenizer tokenizer;

    @Before
    public void setup() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        String expressionString = "1 + 2";
        tokenizer = new Tokenizer(expressionString, configuration);
    }

    @Test
    public void testParseTokenType_OpType_Byte() {
        // Test that getByte() returns Type.Optype
        assertEquals(Type.OPTYPE, tokenizer.getByte().getType());
    }

}