package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GeneratedParseValidExpressionTest {

    @Test
    public void parseValidExpressionTest() {
        try {
            String expressionString = "3 + 4";
            ExpressionConfiguration config = createExpressionConfiguration();
            Tokenizer tokenizer = new Tokenizer(expressionString, config);
            List<Token> tokens = tokenizer.parse();

            assertEquals(TokenType.NUMBER, tokens.get(0).getType());
            assertEquals(TokenType.OPERATOR, tokens.get(1).getType());
            assertEquals(TokenType.NUMBER, tokens.get(2).getType());
        } catch (ParseException e) {
            fail("Expected no exception, but got: " + e.getMessage());
        }
    }

}