package com.ezylang.evalex.parser;

import org.ezylang.evalex.EvalEx;
import org.ezylang.evalex.ExpressionConfiguration;
import org.ezylang.evalex.Tokenizer;
import org.ezylang.evalex.TokenType;
import org.junit.jupiter.api.Test;

public class GeneratedTestExpression {

    @Test
    public void testExpression() {
        String expressionString = "sin(x)";
        EvalEx evalEx = new EvalEx();
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString).withConfiguration(configuration);
        tokenizer.parse();

        assertEquals(TokenType.FUNCTION, tokenizer.getTokens().get(0).getType());
        assertEquals(FunctionType.SIN, configuration.getFunction());
        assertEquals(VariableType.X, configuration.getVariable());

        evalEx.execute(configuration);
    }

}