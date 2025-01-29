package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedParseStringLiteralTest {

    private Tokenizer tokenizer = new Tokenizer("1 + 2", ExpressionConfiguration.DEFAULT);

    @Test
    public void parseStringLiteralTest() {
        when(expressionString()).thenReturn("1 + 2");
        List<Token> tokens = tokenizer.parse();
        assertEquals(3, tokens.size());
        assertEquals(new NumberToken(1), tokens.get(0));
        assertEquals("+", tokens.get(1).getType());
        assertEquals(new NumberToken(2), tokens.get(2));
    }

}