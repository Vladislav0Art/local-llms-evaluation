package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Token.*;
import org.junit.jupiter.api.Test;

public class GeneratedTest_parseStringLiteral_Whitespace {

    @Test
    public void test_parseStringLiteral_Whitespace() {
        String expression = "   ";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        when(expressionToConfig(expression)).thenReturn(configuration);
        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> result = tokenizer.parse();
        assertEquals(1, result.size());
    }

}