package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Generated[Tokenizer][Scenario]

Test_parseInvalidExpression {

    @Test
    public void [Tokenizer][Scenario]Test_parseInvalidExpression() {
        String expression = "abc";
        ExpressionConfiguration configuration = new ExpressionConfiguration();

        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> expectedTokens = new ArrayList<>();
        // should throw ParseException
    }

}