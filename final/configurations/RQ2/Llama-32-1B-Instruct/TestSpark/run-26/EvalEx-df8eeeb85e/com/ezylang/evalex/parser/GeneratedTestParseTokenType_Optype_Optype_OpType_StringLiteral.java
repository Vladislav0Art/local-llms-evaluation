package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Token.Type;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestParseTokenType_Optype_Optype_OpType_StringLiteral {

    private Tokenizer tokenizer;

    @Before
    public void setup() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        String expressionString = "1 + 2";
        tokenizer = new Tokenizer(expressionString, configuration);
    }

    @Test
    public void testParseTokenType_Optype_Optype_OpType_StringLiteral() {
        // Test that parseStringLiteral() returns a Token with type StringLiteral
        Token token = tokenizer.parseStringLiteral();
        assertEquals("1 + 2", token.toString());
    }

}