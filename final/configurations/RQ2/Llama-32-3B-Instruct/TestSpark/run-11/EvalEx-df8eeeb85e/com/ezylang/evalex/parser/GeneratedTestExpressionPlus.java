package com.ezylang.evalex.parser;

import org.ezylang.evalex.EvalEx;
import org.ezylang.evalex.ExpressionConfiguration;
import org.ezylang.evalex.Tokenizer;
import org.ezylang.evalex.TokenType;
import org.junit.jupiter.api.Test;

public class GeneratedTestExpressionPlus {

    @Test
    public void testExpressionPlus() {
        String expressionString = "x + y";
        EvalEx evalEx = new EvalEx();
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString).withConfiguration(configuration);
        tokenizer.parse();

        assertEquals(TokenType.PLUS, tokenizer.getTokens().get(0).getType());
        assertEquals(VariableType.X, configuration.getVariable1());
        assertEquals(VariableType.Y, configuration.getVariable2());

        evalEx.execute(configuration);
    }

}