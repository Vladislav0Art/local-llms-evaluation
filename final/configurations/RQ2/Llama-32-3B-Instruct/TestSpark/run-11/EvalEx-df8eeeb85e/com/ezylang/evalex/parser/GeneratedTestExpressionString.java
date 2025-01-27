package com.ezylang.evalex.parser;

import org.ezylang.evalex.EvalEx;
import org.ezylang.evalex.ExpressionConfiguration;
import org.ezylang.evalex.Tokenizer;
import org.ezylang.evalex.TokenType;
import org.junit.jupiter.api.Test;

public class GeneratedTestExpressionString {

    @Test
    public void testExpressionString() {
        String expressionString = "'Hello'";
        EvalEx evalEx = new EvalEx();
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString).withConfiguration(configuration);
        tokenizer.parse();

        assertEquals(TokenType.STRING_LITERAL, tokenizer.getTokens().get(0).getType());
    }

}