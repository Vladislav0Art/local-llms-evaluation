package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GeneratedParseStringLiteralTest {

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