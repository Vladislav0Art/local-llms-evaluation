package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.*;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.parser.Token.TokenType;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GeneratedParseStringLiteralTest {

    @Test
    public void parseStringLiteralTest() {
        try {
            ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
            StringTokenizer tokenizer = new StringTokenizer("\"hello\"", mockConfig);
            Token token = tokenizer.parseStringLiteral();
            assertEquals(token.getTokenType(), TokenType.STRING);
            assertEquals(token.getValue(), "hello");
        } catch (Exception e) {
            fail("ParseStringLiteral failed with exception: " + e.getMessage());
        }
    }

}