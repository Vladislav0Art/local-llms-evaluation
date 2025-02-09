package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GeneratedTest {

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

    @Test
    public void parseStringLiteralTest() {
        try {
            String expressionString = "\"stringLiteral\"";
            ExpressionConfiguration config = createExpressionConfiguration();
            Tokenizer tokenizer = new Tokenizer(expressionString, config);

            Token token = tokenizer.parseStringLiteral();
            assertEquals(TokenType.STRINGPARAM, token.getType());
            assertEquals("stringLiteral", token.toString());
        } catch (ParseException e) {
            fail("Expected no exception, but got: " + e.getMessage());
        }
    }

    private ExpressionConfiguration createExpressionConfiguration() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        FunctionIfc function = Mockito.mock(FunctionIfc.class);
        config.getFunctionDictionary().addFunction("sin", function);
        OperatorIfc operator = Mockito.mock(OperatorIfc.class);
        config.getOperatorDictionary().addOperator("+", operator);
        return config;
    }

}