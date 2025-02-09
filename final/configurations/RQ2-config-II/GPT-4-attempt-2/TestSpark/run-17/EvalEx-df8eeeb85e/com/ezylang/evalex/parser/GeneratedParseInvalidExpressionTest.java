package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GeneratedParseInvalidExpressionTest {

    @Test
    public void parseInvalidExpressionTest() {
        try {
            String expressionString = "invalidExpression";
            ExpressionConfiguration config = createExpressionConfiguration();
            Tokenizer tokenizer = new Tokenizer(expressionString, config);

            tokenizer.parse();
            fail("Expected ParseException");
        } catch (ParseException expectedException) {
            assertEquals("Failed to parse expression: invalidExpression", expectedException.getMessage());
        }
    }

}