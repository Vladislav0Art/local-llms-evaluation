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

public class GeneratedParseStringLiteral_OkayNumber {

    @Test
    public void parseStringLiteral_OkayNumber() {
        String expressionString = "123";
        Token token = new Token(123);

        Tokenizer tokenizer = new Tokenizer(expressionString, new ExpressionConfiguration());
        assertTrue(tokenizer.parseStringLiteral().getType() == TYPE_NUMBER);
    }

}