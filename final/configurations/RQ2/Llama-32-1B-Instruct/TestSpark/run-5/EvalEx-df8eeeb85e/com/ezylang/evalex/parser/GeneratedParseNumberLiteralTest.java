package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedParseNumberLiteralTest {

    private Tokenizer tokenizer = new Tokenizer("1 + 2", ExpressionConfiguration.DEFAULT);

    @Test
    public void parseNumberLiteralTest() {
        when(expressionString()).thenReturn("5.5");
        List<Token> tokens = tokenizer.parse();
        assertEquals(2, tokens.size());
        assertEquals(new NumberLiteralToken(5.5), tokens.get(0));
    }

}