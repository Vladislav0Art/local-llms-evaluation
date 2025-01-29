package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedParseOperatorLiteralTest {

    private Tokenizer tokenizer = new Tokenizer("1 + 2", ExpressionConfiguration.DEFAULT);

    @Test
    public void parseOperatorLiteralTest() {
        when(expressionString()).thenReturn("+");
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());
        assertEquals(new OperatorLiteralToken("+"), tokens.get(0));
    }

}