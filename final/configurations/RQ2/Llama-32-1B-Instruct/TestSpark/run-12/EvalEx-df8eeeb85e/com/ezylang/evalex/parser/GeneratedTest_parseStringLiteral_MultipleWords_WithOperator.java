package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Token.*;
import org.junit.jupiter.api.Test;

public class GeneratedTest_parseStringLiteral_MultipleWords_WithOperator {

    @Test
    public void test_parseStringLiteral_MultipleWords_WithOperator() {
        String expression = "(1+2*3)+";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        when(expressionToConfig(expression)).thenReturn(configuration);
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> result = tokenizer.parse();
        assertEquals(5, result.size());
    }

}