package com.ezylang.evalex.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;

public class GeneratedParse_OkayNotValidExpression {

    @Test
    public void parse_OkayNotValidExpression() {
        String expressionString = "#$";
        try {
            Tokenizer tokenizer = new Tokenizer(expressionString, new ExpressionConfiguration());
            tokenizer.parse();
            assertFalse(true); // this should not happen
        } catch (ParseException e) {
            assertTrue(true);
        }
    }

}