package com.ezylang.evalex.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;

public class GeneratedParseStringLiteral_OkayStringLiteral {

    @Test
    public void parseStringLiteral_OkayStringLiteral() {
        String expressionString = "\"hello\"";
        Token token = new Token("\"hello\"");

        Tokenizer tokenizer = new Tokenizer(expressionString, new ExpressionConfiguration());
        assertTrue(tokenizer.parseStringLiteral().getType() == TYPE_STRING_LITERAL);
    }

}